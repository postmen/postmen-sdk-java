package com.postmen.javasdk.handler;

import com.google.api.client.http.HttpHeaders;

public class RateLimit {
	private Integer rateCount = 10;
	private Long resetTime = new Long(0);
	
	public Integer getRateCount() {
		return rateCount;
	}
	public void setRateCount(Integer rateCount) {
		this.rateCount = rateCount;
	}
	public long getResetTime() {
		return resetTime;
	}
	public void setResetTime(Long resetTime) {
		this.resetTime = resetTime;
	}
	public void decrementRateCount() {
		if(rateCount >= 0) {
			rateCount--;
		}
	}
	public void setRateLimit(HttpHeaders headers) {
		Integer rateCount = Integer.parseInt(headers.getFirstHeaderStringValue("X-RateLimit-Remaining"));
		// rateLimit = Integer.parseInt(headers.getFirstHeaderStringValue("X-RateLimit-Limit"));
		Long resetTime = Long.parseLong(headers.getFirstHeaderStringValue("X-RateLimit-Reset"));
		this.rateCount = rateCount;
		this.resetTime = resetTime;
	}
}
