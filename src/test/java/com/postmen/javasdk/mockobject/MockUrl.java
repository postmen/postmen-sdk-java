package com.postmen.javasdk.mockobject;

import com.postmen.javasdk.util.PostmenUrl;

public class MockUrl {
	private static PostmenUrl url = new PostmenUrl("http://www.google.com");
	
	public static PostmenUrl getUrl() {
		return url;
	}
}
