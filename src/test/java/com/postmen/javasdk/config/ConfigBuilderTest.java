package com.postmen.javasdk.config;

import org.junit.Test;

import com.postmen.javasdk.exception.ConfigException;

import junit.framework.TestCase;

public class ConfigBuilderTest extends TestCase {

	@Test
	public void testBuildWithoutApiKey() {
		ConfigException err = null;
		try {
			new ConfigBuilder().build();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			err = e;
		}
		assertNotNull(err);
	}
	
	@Test
	public void testBuildWithoutRegion() {
		ConfigException err = null;
		try {
			new ConfigBuilder().setApiKey("test").build();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			err = e;
		}
		assertNotNull(err);
	}
	
	@Test
	public void testBuildWithEndpoint() {
		ConfigException err = null;
		Config config = null;
		String endpoint = "http://www.postmen.com";
		try {
			config = new ConfigBuilder().setEndpoint(endpoint).setApiKey("test").build();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			err = e;
		}
		assertNull(err);
		assertEquals(config.getEndpoint(), endpoint);
	}
	
	@Test
	public void testRegionIsSandbox() {
		ConfigException err = null;
		Config config = null;
		String endpoint = "https://sandbox-api.postmen.com/v3";
		try {
			config = new ConfigBuilder().setRegion("sandbox").setApiKey("test").build();
		} catch (ConfigException e) {
			err = e;
		}
		assertNull(err);
		assertEquals(config.getEndpoint(), endpoint);
		
	}
	
}
