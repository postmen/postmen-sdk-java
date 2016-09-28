package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class ManifestResponse extends Response {
	@Key
	private Manifest data;

	public Manifest getData() {
		return data;
	}

	public void setData(Manifest data) {
		this.data = data;
	}
}
