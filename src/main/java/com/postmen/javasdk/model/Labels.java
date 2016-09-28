package com.postmen.javasdk.model;

import java.util.List;

import com.google.api.client.util.Key;

public class Labels {
	
	@Key("next_token")
	private String nextToken;
	@Key
	private Integer limit;
	@Key("created_at_min")
	private String createdAtMin;
	@Key("created_at_max")
	private String createdAtMax;
	@Key
	private List<Label> labels;
	
	public String getNextToken() {
		return nextToken;
	}
	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getCreatedAtMin() {
		return createdAtMin;
	}
	public void setCreatedAtMin(String createdAtMin) {
		this.createdAtMin = createdAtMin;
	}
	public String getCreatedAtMax() {
		return createdAtMax;
	}
	public void setCreatedAtMax(String createdAtMax) {
		this.createdAtMax = createdAtMax;
	}
	public List<Label> getLabels() {
		return labels;
	}
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}
	
	
}
