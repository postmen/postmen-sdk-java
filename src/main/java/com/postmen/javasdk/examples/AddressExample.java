package com.postmen.javasdk.examples;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.config.ConfigBuilder;
import com.postmen.javasdk.exception.ConfigException;
import com.postmen.javasdk.exception.PostmenException;
import com.postmen.javasdk.model.AddressRequest;
import com.postmen.javasdk.model.AddressRequestInfo;
import com.postmen.javasdk.model.AddressResponse;
import com.postmen.javasdk.service.AddressService;

import java.io.IOException;

public class AddressExample {

    public static void create() {

        try {
            ExampleHelper.enableLogging();
            Config config = new ConfigBuilder().setApiKey(ExampleHelper.getApiKey()).setEndpoint("http://localhost:8001/v3").build();
            AddressService addressService = new AddressService(config);

            AddressRequestInfo address = new AddressRequestInfo();
            AddressRequest req = new AddressRequest();

            address.setContactName("testing");
            address.setStreet1("4901 N New Hope Rd Apt C1");
            address.setCity("Raleigh");
            address.setState("NC");
            address.setPostalCode("27604");
            address.setCountry("USA");
            address.setType("business");
            address.setPhone("18878976058");
            address.setEmail("testing-test@gmail.com");

            req.setAddress(address);

            AddressResponse res = addressService.create(req);

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
}
