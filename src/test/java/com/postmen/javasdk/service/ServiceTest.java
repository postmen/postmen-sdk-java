package com.postmen.javasdk.service;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.config.ConfigBuilder;
import com.postmen.javasdk.exception.ConfigException;
import com.postmen.javasdk.handler.Handler;
import com.postmen.javasdk.mockobject.MockHandler;
import com.postmen.javasdk.model.MapResponse;
import com.postmen.javasdk.service.Service;

import junit.framework.TestCase;

public class ServiceTest extends TestCase{
	
	private Config config;
	private ServiceTestClass serviceTestClass;
	private String name = "test";
	
	@Before
	public void setUp() throws ConfigException {
		config = new ConfigBuilder().setRegion("sandbox").setApiKey("asdad").build();
		serviceTestClass = new ServiceTestClass(config, name);
	}
	
	@Test
	public void testGetServiceName() {
		assertEquals(name, serviceTestClass.getServiceName());
	}
	
	@Test
	public void testGetHandler() {
		assertTrue(serviceTestClass.getHandler() instanceof Handler);
	}
	
	public class ServiceTestClass extends Service {
		public ServiceTestClass(Config config, String serviceName) {
			super(new MockHandler(config), config, serviceName);
		}
		
		public String getServiceName() {
			return super.getServiceName();
		}
		
		public Handler getHandler() {
			return super.getHandler();
		}
	}	
}
