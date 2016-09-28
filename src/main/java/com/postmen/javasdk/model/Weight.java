package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class Weight {
	@Key
	private double value;
	@Key
	private String unit;
	
	public Weight() {
		
	}
	
	public Weight(double value, String unit) {
		this.value = value;
		this.unit = unit;
	}
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}
