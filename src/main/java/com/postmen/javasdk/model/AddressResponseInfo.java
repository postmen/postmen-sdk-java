package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class AddressResponseInfo {
    @Key
    private String id;
    @Key
    private String status;
    @Key("created_at")
    private String createdAt;
    @Key("updated_at")
    private String updatedAt;

    @Key("address")
    private Address address;
    @Key("recommended_address")
    private Address recommendedAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getRecommendedAddress() {
        return recommendedAddress;
    }

    public void setRecommendedAddress(Address recommendedAddress) {
        this.recommendedAddress = recommendedAddress;
    }
}
