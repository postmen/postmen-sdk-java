package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class AddressResponse extends Response{

    @Key
    private AddressResponseInfo data;

    @Override
    public AddressResponseInfo getData() {
        return data;
    }

    public void setData(AddressResponseInfo data) {
        this.data = data;
    }
}
