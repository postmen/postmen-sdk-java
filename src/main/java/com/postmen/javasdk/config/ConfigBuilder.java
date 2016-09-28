package com.postmen.javasdk.config;

import com.postmen.javasdk.exception.ConfigException;

public class ConfigBuilder {
	private String apiKey = null;
	private String version = "v3";
	private String proxyUrl = null;
	private int proxyPort = 80;
	private boolean retry = true;
	private boolean rate = true;
	private String region = null;
	private String endpoint = null;
	
	public ConfigBuilder() {
		
	}
	
	public ConfigBuilder setApiKey(String apiKey) {
		this.apiKey = apiKey;
		return this;
	}
	
	public ConfigBuilder setEndpoint(String endpoint){
		this.endpoint = endpoint;
		return this;
	}
	public ConfigBuilder setVersion(String version){
		this.version = version;
		return this;
	}
	public ConfigBuilder setProxyUrl(String proxyUrl){
		this.proxyUrl = proxyUrl;
		return this;
	}
	public ConfigBuilder setProxyPort(int proxyPort){
		this.proxyPort = proxyPort;
		return this;
	}
	public ConfigBuilder setRetry(boolean retry){
		this.retry = retry;
		return this;
	}
	public ConfigBuilder setRate(boolean rate){
		this.rate = rate;
		return this;
	}
	
	public ConfigBuilder setRegion(String region) {
		this.region = region;
		return this;
	}
	
	public Config build() throws ConfigException {
		if (apiKey == null) {
			throw new ConfigException("api key is null");
		}
		String endpoint;
		if (region == null) {
			if(this.endpoint == null) {
				throw new ConfigException("please choose region or add an endpoint");
			} else {
				endpoint = this.endpoint;
			}
			
		} else {
			StringBuffer sb = new StringBuffer();
			sb.append("https://");
			sb.append(region);
			sb.append("-api.postmen.com/");
			sb.append(version);
			endpoint = sb.toString();
		}

		Config config = new Config();
		config.setApiKey(apiKey);
		config.setProxyPort(proxyPort);
		config.setProxyUrl(proxyUrl);
		config.setRate(rate);
		config.setRetry(retry);
		config.setEndpoint(endpoint);
		
		return config;
	}
}
