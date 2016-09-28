package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class Detail {
	@Key
	private String path;
	@Key
	private String info;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
