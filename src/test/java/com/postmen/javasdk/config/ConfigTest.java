package com.postmen.javasdk.config;

import org.junit.Test;

import com.postmen.javasdk.exception.ConfigException;

import junit.framework.TestCase;

public class ConfigTest extends TestCase {

	@Test
	public void testClone() throws ConfigException {
		String apiKey = "test";
		String endpoint = "http://www.postmen.com";
		Config config = new ConfigBuilder().setApiKey(apiKey).setEndpoint(endpoint).build();
		Config newConfig = config.clone();
		
		assertNotSame(newConfig, config);
		assertEquals(newConfig.getApiKey(), config.getApiKey());
		assertEquals(newConfig.getEndpoint(), config.getEndpoint());
		assertEquals(newConfig.getProxyPort(), config.getProxyPort());
		assertEquals(newConfig.getProxyUrl(), config.getProxyUrl());
		assertEquals(newConfig.isRate(), config.isRate());
		assertEquals(newConfig.isRetry(), config.isRetry());
	}
}
