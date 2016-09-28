package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class RateResponse extends Response{
	@Key
	private Rate data;
	
	public Rate getData() {
		return data;
	}

	public void setData(Rate data) {
		this.data = data;
	}
}
