package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class Address {
	@Key
	private String country;
	@Key("contact_name")
	private String contactName;
	@Key
	private String phone;
	@Key
	private String fax;
	@Key
	private String email;
	@Key("company_name")
	private String companyName;
	@Key
	private String street1;
	@Key
	private String street2;
	@Key
	private String street3;
	@Key
	private String city;
	@Key
	private String state;
	@Key("postal_code")
	private String postalCode;
	@Key
	private String type;
	@Key("tax_id")
	private String taxId;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getStreet3() {
		return street3;
	}
	public void setStreet3(String street3) {
		this.street3 = street3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

}
