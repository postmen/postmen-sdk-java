package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class ManifestRequest extends Request {
	@Key("shipper_account")
	private ShipperAccount shipperAccount;

	public ManifestRequest() {
		
	}
	
	public ManifestRequest(ShipperAccount shipperAccount) {
		this.shipperAccount = shipperAccount;
	}
	
	public ManifestRequest(String shipperAccountId) {
		this.shipperAccount = new ShipperAccount(shipperAccountId);
	}
	
	public ShipperAccount getShipperAccount() {
		return shipperAccount;
	}

	public void setShipperAccount(ShipperAccount shipperAccount) {
		this.shipperAccount = shipperAccount;
	}
	
	
}
