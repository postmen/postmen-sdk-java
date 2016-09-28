package com.postmen.javasdk.exception;

import java.io.IOException;
import java.util.List;

import com.postmen.javasdk.model.Detail;
import com.postmen.javasdk.model.Response;

public class PostmenException extends IOException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -671762530914847990L;
	
	private Response response;
	private Integer code;
	private Boolean retryable;
	private List<Detail> details;
	
	public PostmenException(Response response) {
		super(response.getMeta().getMessage());
		this.response = response;
		this.code = response.getMeta().getCode();
		this.retryable = response.getMeta().isRetryable();
		this.details = response.getMeta().getDetail();
	}
	
	public Response getResponse() {
		return response;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public Boolean isRetryable() {
		return retryable;
	}
	
	public List<Detail> getDetails() {
		return details;
	}

}
