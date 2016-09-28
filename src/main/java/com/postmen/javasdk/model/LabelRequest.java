package com.postmen.javasdk.model;

import java.sql.Date;

import com.google.api.client.util.Key;

public class LabelRequest extends Request {
	@Key("paper_size")
	private String paperSize;
	@Key("service_type")
	private String serviceType;
	@Key("is_document")
	private Boolean isDocument;
	@Key("return_shipment")
	private Boolean returnShipment;
	@Key("ship_date")
	private Date shipDate;
	@Key("service_options")
	private String[] serviceOptions;
	@Key
	private String[] references;
	
	@Key("shipper_account")
	private ShipperAccount shipperAccount;
	@Key
	private Shipment shipment;
	@Key
	private Invoice invoice;
	@Key
	private Billing billing;
	@Key
	private Customs customs;
	
	public String getPaperSize() {
		return paperSize;
	}
	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public Boolean isDocument() {
		return isDocument;
	}
	public void setDocument(Boolean isDocument) {
		this.isDocument = isDocument;
	}
	public Boolean isReturnShipment() {
		return returnShipment;
	}
	public void setReturnShipment(Boolean returnShipment) {
		this.returnShipment = returnShipment;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	public String[] getServiceOptions() {
		return serviceOptions;
	}
	public void setServiceOptions(String[] serviceOptions) {
		this.serviceOptions = serviceOptions;
	}
	public String[] getReferences() {
		return references;
	}
	public void setReferences(String[] references) {
		this.references = references;
	}
	public ShipperAccount getShipperAccount() {
		return shipperAccount;
	}
	public void setShipperAccount(ShipperAccount shipperAccount) {
		this.shipperAccount = shipperAccount;
	}
	public Shipment getShipment() {
		return shipment;
	}
	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	public Customs getCustoms() {
		return customs;
	}
	public void setCustoms(Customs customs) {
		this.customs = customs;
	}
	
}
