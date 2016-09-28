package com.postmen.javasdk.model;

import java.util.HashMap;
import java.util.Map;

import com.google.api.client.util.Key;

public class ShipperAccount {
	@Key("created_at")
	private String createdAt;
	@Key
	private String id;
	@Key
	private String description;
	@Key
	private String slug;
	@Key
	private String timezone;
	@Key("updated_at")
	private String updateAt;
	@Key
	private Address address;
	@Key("credentials")
	private Map<String, String> credentials;

	public ShipperAccount() {
		
	}
	
	public ShipperAccount(String id) {
		this.id = id;
	}
	
	public Map<String, String> getCredentials() {
		return credentials;
	}

	public void setCredentials(String key, String value) {
		if(credentials == null){
			credentials = new HashMap<String, String>();
		}
		credentials.put(key, value);
	}
	
	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
/*
	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}	
	*/
}
