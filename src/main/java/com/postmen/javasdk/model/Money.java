package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class Money {
	@Key
	private int amount;
	@Key
	private String currency;
	
	public Money() {
		
	}
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
