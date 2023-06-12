package com.d3vshub.controllers;

import com.d3vshub.api.CustomerApi;
import com.d3vshub.model.Customer;
import com.d3vshub.openapi.api.ApiApi;
import com.d3vshub.repository.CustomerRepository;
import com.d3vshub.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController implements CustomerApi {

    @Autowired
    CustomerService customerService;

    @GetMapping("/api/customer")
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/api/customer/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    @PostMapping("api/customer/new")
    public ResponseEntity<Void> addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
        return ResponseEntity.ok().build();
    }
}
