package com.d3vshub.controllers;

import com.d3vshub.api.CourierApi;
import com.d3vshub.model.Courier;
import com.d3vshub.openapi.api.ApiApi;
import com.d3vshub.repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourierController implements CourierApi {

    @Autowired
    CourierRepository courierRepository;
    @Override
    @GetMapping("/api/get/couriers")
    public List<Courier> showAllCouriers() {
        return courierRepository.findAll();
    }
}
