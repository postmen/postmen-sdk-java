package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class RawResponse extends Response{
	@Key
	private String data;
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}
