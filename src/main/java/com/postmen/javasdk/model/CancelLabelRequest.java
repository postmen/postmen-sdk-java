package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class CancelLabelRequest extends Request {
	@Key
	private LabelInfo label;

	public CancelLabelRequest() {
		
	}
	
	public CancelLabelRequest(LabelInfo label) {
		this.label = label;
	}
	
	public LabelInfo getLabel() {
		return label;
	}

	public void setLabel(LabelInfo label) {
		this.label = label;
	}
	
	
}
