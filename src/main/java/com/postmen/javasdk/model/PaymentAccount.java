package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class PaymentAccount {
	@Key
	private String type;
	@Key("account_number")
	private String accountNumber;
	@Key("postal_code")
	private String postalCode;
	@Key
	private String country;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
