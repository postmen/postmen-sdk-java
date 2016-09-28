package com.postmen.javasdk.model;

import java.util.List;

import com.google.api.client.util.Key;

public class Rate {
	
	@Key
	private String id;
	@Key("updated_at")
	private String updatedAt;
	@Key("created_at")
	private String createdAt;
	@Key
	private String status;
	@Key("rates")
	private List<RateInfo> ratesInfo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<RateInfo> getRatesInfo() {
		return ratesInfo;
	}
	public void setRatesInfo(List<RateInfo> ratesInfo) {
		this.ratesInfo = ratesInfo;
	}
	
	
}
