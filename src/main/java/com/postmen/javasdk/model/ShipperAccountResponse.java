package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class ShipperAccountResponse extends Response {
	
	@Key("data")
	private ShipperAccount shipperAccount;

	public void setShipperAccount(ShipperAccount shipperAccount) {
		this.shipperAccount = shipperAccount;
	}

	@Override
	public ShipperAccount getData() {
		return shipperAccount;
	}
}
