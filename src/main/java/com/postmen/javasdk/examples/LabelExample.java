package com.postmen.javasdk.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.config.ConfigBuilder;
import com.postmen.javasdk.exception.ConfigException;
import com.postmen.javasdk.exception.PostmenException;
import com.postmen.javasdk.model.Address;
import com.postmen.javasdk.model.Customs;
import com.postmen.javasdk.model.Dimension;
import com.postmen.javasdk.model.Item;
import com.postmen.javasdk.model.LabelRequest;
import com.postmen.javasdk.model.LabelResponse;
import com.postmen.javasdk.model.LabelsResponse;
import com.postmen.javasdk.model.Money;
import com.postmen.javasdk.model.Parcel;
import com.postmen.javasdk.model.Shipment;
import com.postmen.javasdk.model.ShipperAccount;
import com.postmen.javasdk.model.Weight;
import com.postmen.javasdk.service.LabelService;

public class LabelExample {
	
	public static void create() {
		try {
			// Config config = new ConfigBuilder().setRetry(true).setRate(true).setUrl("http://localhost:8001/").setApiKey(apiKey).build();
	    	ExampleHelper.enableLogging();
			Config config = new ConfigBuilder().setEndpoint("http://localhost:8001/v3").setApiKey(ExampleHelper.getApiKey()).build();
			LabelService service = new LabelService(config);
			LabelRequest req = ExampleHelper.createLabelRequest();
	    	
			LabelResponse label = service.create(req);
	    	
			ExampleHelper.printObject(label);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getWithId(String id) {
		try {
			Config config = new ConfigBuilder().setEndpoint("http://localhost:8001/v3").setApiKey(ExampleHelper.getApiKey()).build();
	    	
			LabelService service = new LabelService(config);
			LabelResponse label = service.getById(id);
			ExampleHelper.printObject(label);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void get() {
		try {
			Config config = new ConfigBuilder().setEndpoint("http://localhost:8001/v3").setApiKey(ExampleHelper.getApiKey()).build();
	    	
			LabelService service = new LabelService(config);
			LabelsResponse label = service.get();
			ExampleHelper.printObject(label);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
