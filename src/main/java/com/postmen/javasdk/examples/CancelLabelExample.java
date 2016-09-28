package com.postmen.javasdk.examples;

import java.io.IOException;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.config.ConfigBuilder;
import com.postmen.javasdk.exception.ConfigException;
import com.postmen.javasdk.exception.PostmenException;
import com.postmen.javasdk.model.CancelLabelRequest;
import com.postmen.javasdk.model.CancelLabelResponse;
import com.postmen.javasdk.model.CancelLabelsResponse;
import com.postmen.javasdk.model.Label;
import com.postmen.javasdk.model.LabelInfo;
import com.postmen.javasdk.model.LabelResponse;
import com.postmen.javasdk.service.CancelLabelService;
import com.postmen.javasdk.service.LabelService;

public class CancelLabelExample {
	
	public static void create(String id) {
		
		try {
			Config config = new ConfigBuilder().setApiKey(ExampleHelper.getApiKey()).setEndpoint("http://localhost:8001/v3").build();
			CancelLabelService cancelService = new CancelLabelService(config);
			
			LabelInfo label = new LabelInfo(id);
			CancelLabelRequest req = new CancelLabelRequest(label);
			req.setAsync(false);
			CancelLabelResponse res = cancelService.create(req);
			ExampleHelper.printObject(res);
			
		} catch (PostmenException e) {
			ExampleHelper.printObject(e.getResponse().getMeta().getDetail());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void get() {
		try {
			Config config = new ConfigBuilder().setApiKey(ExampleHelper.getApiKey()).setEndpoint("http://localhost:8001/v3").build();
			CancelLabelService cancelService = new CancelLabelService(config);	
			CancelLabelsResponse response = cancelService.get();
			ExampleHelper.printObject(response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getWithId(String id) {
		
		try {
			Config config = new ConfigBuilder().setApiKey(ExampleHelper.getApiKey()).setEndpoint("http://localhost:8001/v3").build();
			CancelLabelService cancelService = new CancelLabelService(config);	
			
			CancelLabelResponse response = cancelService.getById(id);
			ExampleHelper.printObject(response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
