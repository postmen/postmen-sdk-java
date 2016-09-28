package com.postmen.javasdk.handler;

import java.io.IOException;
import com.google.api.client.util.BackOff;

public class ExpBackOff implements BackOff {

	private long delayTime;
	
	public ExpBackOff() {
		delayTime = 1000;
	}
	
	public void reset() throws IOException {
			// TODO Auto-generated method stub
		delayTime = 1000;
	}

	public long nextBackOffMillis() throws IOException {
		// TODO Auto-generated method stub
		long delay = delayTime;
		delayTime *= 2;
		return delay;
	}
}
