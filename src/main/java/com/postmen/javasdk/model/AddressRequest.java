package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class AddressRequest extends Request{
    @Key
    private AddressRequestInfo address;

    public AddressRequestInfo getAddress() {
        return address;
    }

    public void setAddress(AddressRequestInfo address) {
        this.address = address;
    }
}
