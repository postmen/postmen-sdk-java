package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class Money {
	@Key
	private double amount;
	@Key
	private String currency;
	
	public Money() {
		
	}
	
	public Money(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public double getAmount() {
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
