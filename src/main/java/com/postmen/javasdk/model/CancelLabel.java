package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class CancelLabel {
	@Key
	private String id;
	@Key 
	private String status;
	@Key("label")
	private LabelInfo label;
	@Key("created_at")
	private String createdAt;
	@Key("updated_at")
	private String updatedAt;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LabelInfo getLabel() {
		return label;
	}
	public void setLabel(LabelInfo label) {
		this.label = label;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
