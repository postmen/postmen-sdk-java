package com.postmen.javasdk.handler;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.postmen.javasdk.handler.ExpBackOff;

import junit.framework.TestCase;

public class ExpBackOffTest extends TestCase {
	
	private ExpBackOff expBackOff;
	
	@Before
	public void setUp() {
		expBackOff = new ExpBackOff();
	}
	
	@Test
	public void testNextDelay() throws IOException {
		assertEquals((long)1000, expBackOff.nextBackOffMillis());
	}
	
	@Test
	public void testNextDelayFiveTimes() throws IOException {
		for (int i=0; i < 5; i++) {
			long delay = expBackOff.nextBackOffMillis();
			if(i == 4) {
				assertEquals(16000, delay);
			}
		}
	}
	
	@Test
	public void testReset() throws IOException {
		for (int i=0; i < 5; i++) {
			expBackOff.nextBackOffMillis();
		}
		expBackOff.reset();
		assertEquals(1000, expBackOff.nextBackOffMillis());
	}
}
