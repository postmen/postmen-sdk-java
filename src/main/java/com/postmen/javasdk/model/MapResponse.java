package com.postmen.javasdk.model;

import java.util.Map;

import com.google.api.client.util.Key;

public class MapResponse extends Response{
	@Key
	private Map<Object, Object> data;

	public Map<Object, Object> getData() {
		return data;
	}

	public void setData(Map<Object, Object> data) {
		this.data = data;
	}
}
