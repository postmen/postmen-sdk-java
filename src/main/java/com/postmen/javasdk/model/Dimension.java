package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class Dimension {
	@Key
	private int width;
	@Key
	private int height;
	@Key
	private int depth;
	@Key
	private String unit;
	
	public Dimension() {
		
	}
	
	public Dimension(int width, int height, int depth, String unit){
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.unit = unit;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
}
