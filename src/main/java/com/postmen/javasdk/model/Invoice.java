package com.postmen.javasdk.model;

import java.sql.Date;

import com.google.api.client.util.Key;

public class Invoice {
	@Key
	private Date date;
	@Key
	private String number;
	@Key
	private String type;
	@Key("number_of_copies")
	private int numberOfCopies;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	
}
