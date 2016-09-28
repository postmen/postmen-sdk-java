package com.postmen.javasdk.examples;

import java.io.IOException;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.config.ConfigBuilder;
import com.postmen.javasdk.exception.ConfigException;
import com.postmen.javasdk.model.LabelResponse;
import com.postmen.javasdk.model.ManifestRequest;
import com.postmen.javasdk.model.ManifestResponse;
import com.postmen.javasdk.service.LabelService;
import com.postmen.javasdk.service.ManifestService;

public class ManifestExample {

	public static void manifest() {
		
		
		try {
			Config config = new ConfigBuilder().setApiKey(ExampleHelper.getApiKey()).setEndpoint("http://localhost:8001/v3").build();
			ManifestService manifestService = new ManifestService(config);
			
			ManifestRequest req = new ManifestRequest(ExampleHelper.getShipperAccount());
			req.setAsync(false);
			ManifestResponse manifestResponse = manifestService.create(req);
			ExampleHelper.printObject(manifestResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
