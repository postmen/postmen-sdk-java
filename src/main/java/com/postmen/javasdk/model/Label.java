package com.postmen.javasdk.model;

import java.util.List;

import com.google.api.client.util.Key;

public class Label {
	@Key
	private String id;
	@Key
	private String status;
	@Key("created_at")
	private String createdAt;
	@Key("updated_at")
	private String updatedAt;
	@Key("tracking_numbers")
	private List<String> trackingNumbers;
	@Key
	private Files files;
	@Key
	private RateInfo rateInfo;
	
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
	public List<String> getTrackingNumbers() {
		return trackingNumbers;
	}
	public void setTrackingNumbers(List<String> trackingNumbers) {
		this.trackingNumbers = trackingNumbers;
	}
	public Files getFiles() {
		return files;
	}
	public void setFiles(Files files) {
		this.files = files;
	}
	public RateInfo getRate() {
		return rateInfo;
	}
	public void setRate(RateInfo rateInfo) {
		this.rateInfo = rateInfo;
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
