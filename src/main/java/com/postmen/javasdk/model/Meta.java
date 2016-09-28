package com.postmen.javasdk.model;

import java.util.List;

import com.google.api.client.util.Key;

public class Meta {
	@Key
	private Integer code;
	@Key
	private String message;
	@Key
	private List<Detail> details;
	@Key
	private Boolean retryable;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Detail> getDetail() {
		return details;
	}
	public void setDetails(List<Detail> details) {
		this.details = details;
	}
	public Boolean isRetryable(){
		return retryable;
	}
	public void setRetryable(Boolean retryable) {
		this.retryable = retryable;
	}
}
