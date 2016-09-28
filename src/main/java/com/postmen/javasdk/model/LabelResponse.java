package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class LabelResponse extends Response {
	@Key
	private Label data;
	
	public void setData(Label data) {
		this.data = data;
	}
	
	@Override
	public Label getData() {
		return data;
	}
	
	
}
