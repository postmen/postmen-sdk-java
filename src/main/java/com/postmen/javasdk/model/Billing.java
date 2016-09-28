package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class Billing {
	@Key("paid_by")
	private String paidBy;
	@Key
	private PaymentAccount method;
	
	public String getPaidBy() {
		return paidBy;
	}
	public void setPaidBy(String paidBy) {
		this.paidBy = paidBy;
	}
	public PaymentAccount getMethod() {
		return method;
	}
	public void setMethod(PaymentAccount method) {
		this.method = method;
	}
	
	
}
