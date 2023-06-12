package com.d3vshub.controllers;

import com.d3vshub.api.CourierApi;
import com.d3vshub.model.Courier;
import com.d3vshub.openapi.api.ApiApi;
import com.d3vshub.repository.CourierRepository;
import com.d3vshub.services.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourierController implements CourierApi {

    @Autowired
    CourierService courierService;
    @Override
    @GetMapping("/api/courier")
    public List<Courier> showAllCouriers() {
        return courierService.getAllCouriers();
    }

    @GetMapping("/api/courier/{id}")
    public Courier getCourierById(@PathVariable int id){
        return courierService.getCourierById(id);
    }
}
