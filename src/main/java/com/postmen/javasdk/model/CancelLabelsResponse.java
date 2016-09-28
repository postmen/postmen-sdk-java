package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class CancelLabelsResponse extends Response{
	@Key
	private CancelLabels data;

	public CancelLabels getData() {
		return data;
	}

	public void setData(CancelLabels data) {
		this.data = data;
	}
	
	
	
	
}
