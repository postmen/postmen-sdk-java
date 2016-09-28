package com.postmen.javasdk.model;

import java.util.List;

import com.google.api.client.util.Key;

public class Manifests {
	@Key("next_token")
	private String nextToken;
	@Key
	private int limit;
	@Key("created_at_min")
	private String createdAtMin;
	@Key("created_at_max")
	private String createdAtMax;
	@Key
	private List<Manifest> manifests;
	
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
	public List<Manifest> getManifests() {
		return manifests;
	}
	public void setManifests(List<Manifest> manifests) {
		this.manifests = manifests;
	}
}
