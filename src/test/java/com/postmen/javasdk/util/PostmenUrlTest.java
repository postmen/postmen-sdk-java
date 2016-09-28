package com.postmen.javasdk.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.TestCase;

public class PostmenUrlTest extends TestCase {
	
	@Test
	public void testConstructorIsString() {
		String urlString = "http://www.postmen.com/v3";
		PostmenUrl url = new PostmenUrl(urlString);
		assertEquals(urlString, url.toString());
		
	}
	
	@Test
	public void testConstructorIsStringAndPath() {
		String urlString = "http://www.postmen.com/v3";
		String path = "labels";
		PostmenUrl url = new PostmenUrl(urlString, path);
		assertEquals(urlString + "/" + path, url.toString());
	}
	
	@Test
	public void testConstructorIsStringAndPathWithExtraSlash() {
		String urlString = "http://www.postmen.com/v3/";
		String path = "labels";
		PostmenUrl url = new PostmenUrl(urlString, path);
		assertEquals(urlString + path, url.toString());
	}
	
	@Test
	public void testNullWillNotAppendPath() {
		String urlString = "http://www.postmen.com/v3/";
		String path = null;
		PostmenUrl url = new PostmenUrl(urlString, path);
		assertEquals(urlString, url.toString());
	}
	
	@Test
	public void testAppendQueryString() {
		String urlString = "http://www.postmen.com/v3";
		Map<String, String> query = new HashMap<String, String>();
		query.put("test", "value");
		PostmenUrl url = new PostmenUrl(urlString).addQueries(query);
		assertEquals(urlString + "?test=value", url.toString());
	}
	
}
