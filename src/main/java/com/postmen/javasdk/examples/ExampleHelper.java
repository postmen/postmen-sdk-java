package com.postmen.javasdk.examples;

import com.google.api.client.http.HttpTransport;
import com.google.gson.Gson;
import com.postmen.javasdk.model.*;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ExampleHelper {
	
	private static Gson gson = new Gson();
	/**
	 *  You can get API Key and shipper Account from https://secure.postmen.com/
	 */
	private static String apiKey = "Your API Key";
	private static String shipperAccount = "Your shipperAccount";
	
	public static void printObject(Object object){
		String json = gson.toJson(object);
		System.out.println(json);
	}
	
	public static String getApiKey() {
		return apiKey;
	}
	
	public static String getShipperAccount() {
		return shipperAccount;
	}
	
	public static LabelRequest createLabelRequest() {
		LabelRequest req = new LabelRequest();
		
		req.setAsync(false);
		req.setServiceType("spsr_intl");
		
		ShipperAccount shipperAccount = new ShipperAccount(getShipperAccount());
		req.setShipperAccount(shipperAccount);
		
		Parcel parcel = new Parcel();
		parcel.setDescription("Parcel");
		parcel.setBoxType("custom");
		parcel.setWeight(new Weight(1.5, "kg"));
		parcel.setDimension(new Dimension(20, 30, 30, "cm"));
		
		Item item = new Item();
		item.setDescription("Food Bar");
		item.setOriginCountry("USA");
		item.setQuantity(2);
		
		item.setPrice(new Money(50.1, "USD"));
		
		item.setWeight(new Weight(0.6, "kg"));
		item.setSku("Epic_Food_Bar");
		item.setHsCode("7877966");
		
		parcel.addItems(item);
		
		Address shipFrom = new Address();
		shipFrom.setContactName("Joe Smith");
		shipFrom.setCompanyName("Aftership");
		shipFrom.setStreet1("bal");
		shipFrom.setCity("NT");
		shipFrom.setState("HK");
		shipFrom.setPostalCode("N/A");
		shipFrom.setCountry("HKG");
		shipFrom.setPhone("123456789");
		shipFrom.setEmail("mail@mail.com");
		shipFrom.setType("business");
		
		Address shipTo = new Address();
		shipTo.setContactName("Jon Poole");
		shipTo.setStreet1("test");
		shipTo.setCity("Concord");
		shipTo.setState("New Hampshire");
		shipTo.setPostalCode("03301");
		shipTo.setCountry("RUS");
		shipTo.setPhone("12345");
		shipTo.setEmail("test@test.com");
		shipTo.setType("residential");
		
		Shipment shipment = new Shipment();
		shipment.addParcels(parcel);
		shipment.setShipFrom(shipFrom);
		shipment.setShipTo(shipTo);
		req.setShipment(shipment);
		
		Customs customs = new Customs();
		customs.setPurpose("gift");
		customs.setTermsOfTrade("ddu");
		req.setCustoms(customs);
		return req;
	}
	
	public static void enableLogging() {
		Logger logger = Logger.getLogger(HttpTransport.class.getName());
    	logger.setLevel(Level.ALL);
    	logger.addHandler(new Handler() {

			@Override
			public void publish(LogRecord record) {
				// TODO Auto-generated method stub
				if (record.getLevel().intValue() < Level.INFO.intValue()) {
					System.err.println(record.getMessage());
				}
				
			}

			@Override
			public void flush() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void close() throws SecurityException {
				// TODO Auto-generated method stub
				
			}
    		
    	});
	}
	public static void disableLogging() {
		Logger logger = Logger.getLogger(HttpTransport.class.getName());
    	logger.setLevel(Level.OFF);
	}
}
