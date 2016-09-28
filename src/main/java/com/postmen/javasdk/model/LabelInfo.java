package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class LabelInfo {
	@Key
	private String id;
	@Key
	private Boolean manifested;
	
	public LabelInfo() {
		
	}
	
	public LabelInfo(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Boolean isManifested() {
		return manifested;
	}

	public void setManifested(Boolean manifested) {
		this.manifested = manifested;
	}
}
