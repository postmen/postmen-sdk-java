package com.postmen.javasdk.model;

import java.util.List;

import com.google.api.client.util.Key;

public class RateInfo {
	
	@Key("shipper_account")
	private ShipperAccount shipperAccount;
	@Key("service_type")
	private String serviceType;
	@Key("service_name")
	private String serviceName;
	@Key("pickup_deadline")
	private String pickupDeadline;
	@Key("booking_cut_off")
	private String bookingCutOff;
	@Key("delivery_date")
	private String deliveryDate;
	@Key("transit_time")
	private String transitTime;
	@Key("error_message")
	private String errorMessage;
	@Key("info_message")
	private String infoMessage;
	@Key("charge_weight")
	private Weight chargeWeight;
	@Key("total_charge")
	private Money totalCharge;
	@Key("detailed_charges")
	private List<DetailedCharges> detailedCharges;
	
	public ShipperAccount getShipperAccount() {
		return shipperAccount;
	}
	public void setShipperAccount(ShipperAccount shipperAccount) {
		this.shipperAccount = shipperAccount;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getPickupDeadline() {
		return pickupDeadline;
	}
	public void setPickupDeadline(String pickupDeadline) {
		this.pickupDeadline = pickupDeadline;
	}
	public String getBookingCutOff() {
		return bookingCutOff;
	}
	public void setBookingCutOff(String bookingCutOff) {
		this.bookingCutOff = bookingCutOff;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getTransitTime() {
		return transitTime;
	}
	public void setTransitTime(String transitTime) {
		this.transitTime = transitTime;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getInfoMessage() {
		return infoMessage;
	}
	public void setInfoMessage(String infoMessage) {
		this.infoMessage = infoMessage;
	}
	public Weight getChargeWeight() {
		return chargeWeight;
	}
	public void setChargeWeight(Weight chargeWeight) {
		this.chargeWeight = chargeWeight;
	}
	public Money getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(Money totalCharge) {
		this.totalCharge = totalCharge;
	}
	public List<DetailedCharges> getDetailedCharges() {
		return detailedCharges;
	}
	public void setDetailedCharges(List<DetailedCharges> detailedCharges) {
		this.detailedCharges = detailedCharges;
	}
	
	
}
