package com.postmen.javasdk.util;

import java.util.Map;

import com.google.api.client.http.GenericUrl;

public class PostmenUrl extends GenericUrl{
	
	public PostmenUrl(String url) {
		super(url);
	}
	
	public PostmenUrl(String url, String path) {
		super(url);
		if(getPathParts().size() == 2) {
			appendPath(path);
		} else {
			appendRawPath(path);
		}
	}
	
	public PostmenUrl appendPath(String path) {
		if (path != null) {
			getPathParts().add(path);
		}
		return this;
	}
	
	public PostmenUrl addQueries(Map<String, String> query) {
		if (query != null) {
			this.putAll(query);
		}
		return this;
	}

}
