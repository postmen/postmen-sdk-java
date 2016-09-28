package com.postmen.javasdk.config;

public class Config implements Cloneable {
	
	private String apiKey;
	private String endpoint;
	private String proxyUrl;
	private int proxyPort;
	private boolean retry;
	private boolean rate;
	
	public Config(){
	}
	
	
	public String getApiKey() {
		return apiKey;
	}
	
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getEndpoint() {
		return endpoint;
	}
	
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	public boolean isRetry() {
		return retry;
	}
	
	public void setRate(Boolean rate) {
		this.rate = rate;
	}

	public boolean isRate() {
		return rate;
	}
	
	public String getProxyUrl() {
		return proxyUrl;
	}

	public void setProxyUrl(String proxyUrl) {
		this.proxyUrl = proxyUrl;
	}

	public int getProxyPort() {
		return proxyPort;
	}

	public void setProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
	}
	
	public Config clone() {
		Config clone =  new Config();
		clone.apiKey = this.apiKey;
		clone.proxyPort = this.proxyPort;
		clone.proxyUrl = this.proxyUrl;
		clone.endpoint = this.endpoint;
		clone.rate = this.rate;
		clone.retry = this.retry;
		
		return clone;
	}
}
