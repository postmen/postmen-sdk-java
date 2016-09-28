package com.postmen.javasdk.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.google.api.client.http.HttpRequestFactory;
import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.config.ConfigBuilder;
import com.postmen.javasdk.exception.ConfigException;
import com.postmen.javasdk.handler.Handler;
import com.postmen.javasdk.model.LabelResponse;
import com.postmen.javasdk.model.MapResponse;
import com.postmen.javasdk.model.Meta;
import com.postmen.javasdk.model.Response;
import com.postmen.javasdk.util.PostmenUrl;

import junit.framework.TestCase;

public class HandlerTest extends TestCase{
	
	private Handler handler;
	private Config config;
	
	@Before
	public void setUp() throws ConfigException {
		config = new ConfigBuilder().setRegion("sandbox").setApiKey("someApiKey").build();
		handler = new Handler(config) {
			@Override
			public <T extends Response> T execute(HttpRequestFactory requestFactory, String method, PostmenUrl endpoint, Object body, Class<T> type) throws IOException {
				T c = null;
				try {
					c = type.newInstance();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return c;
			}
		};
	}
	
	@Test
	public void testCall() {
		IOException ex = null;
		try {
			Response response = handler.call(null, null, null, LabelResponse.class);
			assertTrue(response instanceof LabelResponse);
		} catch (IOException e) {
			ex = e;
		}	
		assertNull(ex);
	}
	
	@Test
	public void testCallAsMap() {
		IOException ex = null;
		try {
			MapResponse response = handler.callAndParseAsMap(null, null, null);
			assertNotNull(response);
		} catch (IOException e) {
			ex = e;
		}
		assertNull(ex);
 	}
	
	@Test
	public void testCallAsString() {
		IOException ex = null;
		handler = new Handler(config) {
			@Override
			public <T extends Response> T execute(HttpRequestFactory requestFactory, String method, PostmenUrl endpoint, Object body, Class<T> type) throws IOException {
				MapResponse response = new MapResponse();
				response.setData(new HashMap<Object, Object>());
				return (T) response;
			}
		};
		try {
			String response = handler.callAndParseAsString(null, null, null);
			assertNotNull(response);
		} catch (IOException e) {
			ex = e;
		}
		assertNull(ex);
	}
	
}
