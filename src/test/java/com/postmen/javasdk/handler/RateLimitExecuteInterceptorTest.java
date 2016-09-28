package com.postmen.javasdk.handler;

import java.io.IOException;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.testing.http.MockHttpTransport;
import com.postmen.javasdk.mockobject.MockSleeper;

import junit.framework.TestCase;

public class RateLimitExecuteInterceptorTest extends TestCase {
	
	private RateLimitExecuteInterceptor interceptor;
	private HttpTransport transport;
	private MockSleeper sleeper;
	private RateLimit rateLimit;
	
	public RateLimitExecuteInterceptorTest() {
		super("Rate Limit Interceptor");
	}
	
	@Before
	public void setUp() {
		transport = new MockHttpTransport();
		sleeper = new MockSleeper();
		rateLimit = new RateLimit();
		interceptor = new RateLimitExecuteInterceptor(rateLimit, sleeper);
	}
	
	@Test
	public void testInterceptFirstTime() throws IOException {
		HttpRequest request = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
		interceptor.intercept(request);
		assertNull(sleeper.getDelay());	
	}
	
	@Test
	public void testInterceptWhenRateLimitIsZero() {
		try {
			HttpRequest request = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
			long time = Calendar.getInstance().getTimeInMillis() + 5000;
			rateLimit.setResetTime(time);
			rateLimit.setRateCount(-1);
			interceptor.intercept(request);
			Double delay = sleeper.getDelay().doubleValue();
			delay = Math.ceil(delay/10) * 10;
			assertTrue(delay.intValue() > 4000 && delay.intValue() <= 5000);
		} catch (IOException e) {
			
		}
	}
}
