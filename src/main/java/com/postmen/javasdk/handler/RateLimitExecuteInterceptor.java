package com.postmen.javasdk.handler;

import java.io.IOException;
import java.util.Calendar;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.util.BackOff;
import com.google.api.client.util.BackOffUtils;
import com.google.api.client.util.Sleeper;

public class RateLimitExecuteInterceptor implements HttpExecuteInterceptor {
	
	private RateLimit rateLimit;
	private Sleeper sleeper;
	
	public RateLimitExecuteInterceptor(RateLimit rateLimit, Sleeper sleeper) {
		this.rateLimit = rateLimit;
		this.sleeper = sleeper;
	}
	
	public void intercept(HttpRequest request) throws IOException {
		rateLimit.decrementRateCount();
		System.out.println("This is the rateCount " + rateLimit.getRateCount());
		System.out.println("This is the resetTime " + rateLimit.getResetTime());
		if (rateLimit.getRateCount() < 0) {
			System.out.println("RateLimit Exceeded, computing next call");
			long timeNow = Calendar.getInstance().getTimeInMillis();
			if(timeNow < rateLimit.getResetTime()) {
				BackOff backOff = new RateLimitBackOff(timeNow, rateLimit);
				System.out.println("delay call (from interceptor) " + backOff.nextBackOffMillis());
				try {
					BackOffUtils.next(sleeper, backOff);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
