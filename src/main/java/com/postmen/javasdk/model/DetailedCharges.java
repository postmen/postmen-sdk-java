package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class DetailedCharges {
	@Key
	private String type;
	@Key
	private Money charge;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Money getCharge() {
		return charge;
	}
	public void setCharge(Money charge) {
		this.charge = charge;
	}
}
