package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public abstract class Response {
	@Key
	private Meta meta;

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	
	public abstract Object getData();
}
