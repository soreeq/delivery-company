package com.d3vshub.dto;

public class DeliveryDTO {
    private int id;
    private String address;
    private String city;
    private String postal_code;

    public DeliveryDTO(int id, String address, String city, String postalCode) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.postal_code = postalCode;
    }

    public DeliveryDTO() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

}
