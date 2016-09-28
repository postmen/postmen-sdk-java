package com.postmen.javasdk.mockobject;

import com.google.api.client.util.Sleeper;

public class MockSleeper implements Sleeper {
	private Long delay;
	public void sleep(long millis) throws InterruptedException {
		delay = millis;
	}
	public Long getDelay() {
		return delay;
	}
}
