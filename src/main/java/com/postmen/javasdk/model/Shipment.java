package com.postmen.javasdk.model;

import java.util.ArrayList;
import java.util.List;

import com.google.api.client.util.Key;

public class Shipment {
	@Key("ship_from")
	private Address shipFrom;
	@Key("ship_to")
	private Address shipTo;
	@Key
	private List<Parcel> parcels;
	
	public Address getShipFrom() {
		return shipFrom;
	}
	public void setShipFrom(Address shipFrom) {
		this.shipFrom = shipFrom;
	}
	public Address getShipTo() {
		return shipTo;
	}
	public void setShipTo(Address shipTo) {
		this.shipTo = shipTo;
	}
	public List<Parcel> getParcels() {
		return parcels;
	}
	public void setParcels(List<Parcel> parcels) {
		this.parcels = parcels;
	}
	public void addParcels(Parcel parcel) {
		if(parcels == null) {
			parcels = new ArrayList<Parcel>();
		}
		parcels.add(parcel);
	}
}
