package com.postmen.javasdk.model;

import java.util.ArrayList;
import java.util.List;

import com.google.api.client.util.Key;

public class RateRequest extends Request{
	
	@Key("shipper_accounts")
	private List<ShipperAccount> shipperAccounts;
	@Key
	private Shipment shipment;
	@Key("is_document")
	private Boolean isDocument;
	
	public List<ShipperAccount> getShipperAccount() {
		return shipperAccounts;
	}
	public void setShipperAccount(List<ShipperAccount> shipperAccounts) {
		this.shipperAccounts = shipperAccounts;
	}
	public void addShipperAccount(ShipperAccount shipperAccount) {
		if(shipperAccounts == null) {
			shipperAccounts = new ArrayList<ShipperAccount>();
		}
		shipperAccounts.add(shipperAccount);
	}
	public Shipment getShipment() {
		return shipment;
	}
	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
	public Boolean getIsDocument() {
		return isDocument;
	}
	public void setIsDocument(Boolean isDocument) {
		this.isDocument = isDocument;
	}	
}
