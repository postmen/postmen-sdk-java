package com.postmen.javasdk.model;

import java.util.List;

import com.google.api.client.util.Key;

public class Manifest {
	@Key
	private String id;
	@Key
	private String status;
	@Key("created_at")
	private String createdAt;
	@Key("updated_at")
	private String updatedAt;
	@Key
	private List<LabelInfo> labels;
	@Key
	private Files files;
	
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
	public List<LabelInfo> getLabels() {
		return labels;
	}
	public void setLabels(List<LabelInfo> labels) {
		this.labels = labels;
	}
	public Files getFiles() {
		return files;
	}
	public void setFiles(Files files) {
		this.files = files;
	}
	
	
}
