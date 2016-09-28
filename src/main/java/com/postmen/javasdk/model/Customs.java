package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class Customs {
	@Key
	private String purpose;
	@Key("terms_of_trade")
	private String termsOfTrade;
	
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getTermsOfTrade() {
		return termsOfTrade;
	}
	public void setTermsOfTrade(String termsOfTrade) {
		this.termsOfTrade = termsOfTrade;
	}

}
