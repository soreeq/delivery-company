package com.d3vshub.dto;

import java.util.UUID;

public class CustomerDTO {
    private UUID id;
    private String first_name;
    private String last_name;
    private String email;

    public CustomerDTO() {
    }

    public CustomerDTO(UUID i, String name, String last_name, String email) {
        this.id = i;
        this.first_name = name;
        this.last_name = last_name;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
