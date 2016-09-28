package com.postmen.javasdk.handler;

import java.io.IOException;

import org.junit.Test;

import com.postmen.javasdk.handler.RateLimit;
import com.postmen.javasdk.handler.RateLimitBackOff;

import junit.framework.TestCase;

public class RateLimitBackOffTest extends TestCase{

	@Test
	public void testGetDelay() throws IOException {
		long timeNow = 100;
		long timeNext = 120;
		long ans = timeNext - timeNow;
		RateLimit rateLimit = new RateLimit();
		rateLimit.setResetTime(timeNext);
		RateLimitBackOff backOff = new RateLimitBackOff(timeNow, rateLimit);
		assertEquals(ans, backOff.nextBackOffMillis());
	}
	
	@Test
	public void testReset() throws IOException {	
		long timeNow = 100;
		long timeNext = 120;
		RateLimit rateLimit = new RateLimit();
		rateLimit.setResetTime(timeNext);
		RateLimitBackOff backOff = new RateLimitBackOff(timeNow, rateLimit);
		backOff.reset();
		assertEquals(0, backOff.nextBackOffMillis());		
	}
	
	@Test
	public void testNoNegativeDelay() throws IOException {
		long timeNow = 120;
		long timeNext = 100;
		RateLimit rateLimit = new RateLimit();
		rateLimit.setResetTime(timeNext);
		RateLimitBackOff backOff = new RateLimitBackOff(timeNow, rateLimit);
		assertEquals(0, backOff.nextBackOffMillis());
	}
}
