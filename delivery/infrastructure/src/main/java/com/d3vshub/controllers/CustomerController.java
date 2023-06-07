package com.d3vshub.controllers;

import com.d3vshub.api.CustomerApi;
import com.d3vshub.model.Customer;
import com.d3vshub.openapi.api.ApiApi;
import com.d3vshub.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController implements CustomerApi {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/api/get/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
