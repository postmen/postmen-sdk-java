package com.postmen.javasdk.model;

import java.util.List;

import com.google.api.client.util.Key;

public class CancelLabels {
	@Key("cancel-labels")
	private List<CancelLabel> cancelLabels;
	@Key("next_token")
	private String nextToken;
	@Key
	private int limit;
	@Key
	private int total;
	@Key("created_at_min")
	private String createdAtMin;
	@Key("created_at_max")
	private String createdAtMax;
	
	public List<CancelLabel> getCancelLabel() {
		return cancelLabels;
	}
	public void setCancelLabel(List<CancelLabel> cancelLabels) {
		this.cancelLabels = cancelLabels;
	}
	public String getNextToken() {
		return nextToken;
	}
	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
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
	
	
}
