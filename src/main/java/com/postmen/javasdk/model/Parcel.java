package com.postmen.javasdk.model;

import java.util.ArrayList;
import java.util.List;

import com.google.api.client.util.Key;

public class Parcel {
	@Key("box_type")
	private String boxType;
	@Key
	private Dimension dimension;
	@Key
	private List<Item> items;
	@Key
	private String description;
	@Key
	private Weight weight;
	
	public String getBoxType() {
		return boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public void addItems(Item item) {
		if(items == null) {
			items = new ArrayList<Item>();
		}
		items.add(item);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Weight getWeight() {
		return weight;
	}
	public void setWeight(Weight weight) {
		this.weight = weight;
	}
	
	
}
