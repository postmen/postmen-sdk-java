package com.postmen.javasdk.service;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.model.AddressRequest;
import com.postmen.javasdk.model.AddressResponse;
import com.postmen.javasdk.util.PostmenUrl;

import java.io.IOException;

public class AddressService extends Service {

    /**
     * Instantiates a service to manipulate address
     *
     * @param config Configuration built by ConfigBuilder
     */
    public AddressService(Config config) {
        super(config, "address-validations");
    }

    /**
     * Create an address validation using a Address Request Object
     *
     * @param req Address Request Object
     * @throws IOException Signals that an I/O exception of some sort has occurred
     * @return Label Response Object
     */
    public AddressResponse create(AddressRequest req) throws IOException {
        PostmenUrl url = getUrl();
        AddressResponse addressResponse = post(getHandler(), url, req, AddressResponse.class);
        return addressResponse;
    }
}
