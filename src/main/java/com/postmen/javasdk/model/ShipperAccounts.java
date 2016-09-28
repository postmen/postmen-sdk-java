package com.postmen.javasdk.model;

import java.util.List;

import com.google.api.client.util.Key;

public class ShipperAccounts {
	@Key("next_token")
	private String nextToken;
	@Key
	private Integer limit;
	@Key("shipper_accounts")
	private List<ShipperAccount> shipperAccount;
	
	public String getNextToken() {
		return nextToken;
	}
	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public List<ShipperAccount> getShipperAccount() {
		return shipperAccount;
	}
	public void setShipperAccount(List<ShipperAccount> shipperAccount) {
		this.shipperAccount = shipperAccount;
	}
}
