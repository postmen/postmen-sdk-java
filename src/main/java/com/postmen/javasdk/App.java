package com.postmen.javasdk;

import com.postmen.javasdk.examples.AddressExample;

/**
 * Hello world!
 *
 */
public class App 
{
	// personal API key in test
	// private static final String apiKey = "8552df2f-66dc-4585-a02e-9dc7cba7a45f";
	// master API Key for dev
    public static void main( String[] args ) {
    	// System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "debug");
    	
    	//ShipperAccountExample.get();
    	//ShipperAccountExample.getOne();
    	//ShipperAccountExample.createAndDelete();
    	//ShipperAccountExample.getAsync();
    	//ShipperAccountExample.get();
    	//ShipperAccountExample.getMap();
    	//ShipperAccountExample.getRaw();
    	
//    	LabelExample.create();
    	//LabelExample.getWithId("884c0908-289b-4128-a496-c641295f5075");
    	// LabelExample.get();
    	
    	// LabelExample.get();
    	
    	// RateExample.create();
    	//RateExample.get();
    	// RateExample.getById("15bc7ffe-c1e9-4c5d-be9b-d4a054de65ad");
    	
    	//CancelLabelExample.create("884c0908-289b-4128-a496-c641295f5075");
    	//CancelLabelExample.get();
    	// CancelLabelExample.getWithId("e66e2a1f-08ca-4564-b692-18343231056d");
    	
//    	ManifestExample.manifest();

		AddressExample.create();
    }
    
}
