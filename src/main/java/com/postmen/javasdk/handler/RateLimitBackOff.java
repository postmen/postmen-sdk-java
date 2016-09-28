package com.postmen.javasdk.handler;

import java.io.IOException;

import com.google.api.client.util.BackOff;

public class RateLimitBackOff implements BackOff{

	private long delayTime;
	
	public RateLimitBackOff(long timeNow, RateLimit rateLimit) {
		computeNextRateLimitRetry(timeNow, rateLimit.getResetTime());
	}
	
	public void computeNextRateLimitRetry(long timeNow, long nextTime) {
		long delay = nextTime - timeNow;
		if(delay < 0) {
			delay = 0;
		}
		this.delayTime = delay;
	}

	public void reset() throws IOException {
		delayTime = 0;
		
	}

	public long nextBackOffMillis() throws IOException {
		// TODO Auto-generated method stub
		return delayTime;
	}
}
