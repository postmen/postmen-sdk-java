package com.postmen.javasdk.mockobject;

import java.util.Map;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.handler.Handler;
import com.postmen.javasdk.model.MapResponse;
import com.postmen.javasdk.util.PostmenUrl;

public class MockHandler extends Handler{

	public MockHandler(Config config) {
		super(config);
	}
	
	@Override
	public MapResponse callAndParseAsMap(String method, PostmenUrl url, Object body) {
		return new MapResponse();
	}
	
	@Override
	public String callAndParseAsString(String method, PostmenUrl url, Object body) {
		return "";
	}

}
