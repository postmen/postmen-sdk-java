package com.postmen.javasdk.handler;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.Json;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.api.client.util.Sleeper;
import com.postmen.javasdk.handler.ExpBackOff;
import com.postmen.javasdk.handler.PostmenUnsuccesfulResponseHandler;
import com.postmen.javasdk.mockobject.MockSleeper;
import com.postmen.javasdk.model.LabelResponse;
import com.postmen.javasdk.model.Meta;
import com.postmen.javasdk.util.PostmenUrl;

import junit.framework.TestCase;

public class PostmenUnsuccessfulResponseHandlerTest extends TestCase {
	
	private MockSleeper sleeper;
	private PostmenUnsuccesfulResponseHandler responseHandler;
	private HttpTransport transport;
	public PostmenUnsuccessfulResponseHandlerTest() {
		super("Response Handler");
	}
	
	@Before
	public void setUp() {
		sleeper = new MockSleeper();
		
		responseHandler = new PostmenUnsuccesfulResponseHandler(sleeper, new ExpBackOff(), 5);
		transport = new MockHttpTransport();
	}
	
	@Test
	public void testHandleResponse() {
		HttpRequest req;
		try {
			req = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
			req.setNumberOfRetries(5);
			LabelResponse labelResponse = new LabelResponse();
			Meta meta = new Meta();
			meta.setCode(200);
			meta.setRetryable(true);
			labelResponse.setMeta(meta);
			Boolean retry = responseHandler.handleResponse(req, labelResponse, true);
			assertTrue(retry);
			assertEquals(new Long(1000), sleeper.getDelay());
			//responseHandler.handleResponse(req, labelResponse, true);
		} catch (IOException e) {
		}	
	}
	
	@Test
	public void testExponentialDelay() {
		HttpRequest req;
		try {
			req = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
			req.setNumberOfRetries(5);
			LabelResponse labelResponse = new LabelResponse();
			Meta meta = new Meta();
			meta.setCode(200);
			meta.setRetryable(true);
			labelResponse.setMeta(meta);
			Boolean retry = null;
			Long delay = new Long(1000);
			for(int i = 0; i < 5; i++) {
				retry = responseHandler.handleResponse(req, labelResponse, true);
				assertEquals(delay, sleeper.getDelay());
				delay *= 2;
			}
			assertTrue(retry);
			
			//responseHandler.handleResponse(req, labelResponse, true);
		} catch (IOException e) {
		}	
	}
	@Test
	public void testRetryStopOnSixth() {
		HttpRequest req;
		try {
			req = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
			req.setNumberOfRetries(5);
			LabelResponse labelResponse = new LabelResponse();
			Meta meta = new Meta();
			meta.setCode(200);
			meta.setRetryable(true);
			labelResponse.setMeta(meta);
			Boolean retry = null;
			for(int i = 0; i < 6; i++) {
				retry = responseHandler.handleResponse(req, labelResponse, true);
			}
			assertFalse(retry);
			
			//responseHandler.handleResponse(req, labelResponse, true);
		} catch (IOException e) {
		}	
	}
	
	@Test
	public void testNotRetryable() {
		HttpRequest req;
		try {
			req = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
			req.setNumberOfRetries(5);
			LabelResponse labelResponse = new LabelResponse();
			Meta meta = new Meta();
			meta.setCode(200);
			meta.setRetryable(false);
			labelResponse.setMeta(meta);
			Boolean retry = null;
			retry = responseHandler.handleResponse(req, labelResponse, true);
			assertFalse(retry);
			
			//responseHandler.handleResponse(req, labelResponse, true);
		} catch (IOException e) {
		}	
	}
	
	@Test
	public void testRetryableNullInResponse() {
		HttpRequest req;
		try {
			req = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
			req.setNumberOfRetries(5);
			LabelResponse labelResponse = new LabelResponse();
			Meta meta = new Meta();
			meta.setCode(200);
			meta.setRetryable(null);
			labelResponse.setMeta(meta);
			Boolean retry = null;
			retry = responseHandler.handleResponse(req, labelResponse, true);
			assertFalse(retry);
			
			//responseHandler.handleResponse(req, labelResponse, true);
		} catch (IOException e) {
		}	
	}
	
	@Test
	public void testDoNotRetry() {
		HttpRequest req;
		try {
			req = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
			req.setNumberOfRetries(5);
			LabelResponse labelResponse = new LabelResponse();
			Meta meta = new Meta();
			meta.setCode(200);
			meta.setRetryable(true);
			labelResponse.setMeta(meta);
			Boolean retry = null;
			retry = responseHandler.handleResponse(req, labelResponse, false);
			assertFalse(retry);
			
			//responseHandler.handleResponse(req, labelResponse, true);
		} catch (IOException e) {
		}	
	}
}
