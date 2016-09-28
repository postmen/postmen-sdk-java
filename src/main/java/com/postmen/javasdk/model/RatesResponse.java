package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class RatesResponse extends Response{
	
	@Key
	private Rates data;
	
	@Override
	public Rates getData() {
		return data;
	}
	
	public void setData(Rates data) {
		this.data = data;
	}

}
