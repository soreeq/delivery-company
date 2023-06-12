package com.d3vshub.controllers;

import com.d3vshub.model.Courier;
import com.d3vshub.services.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourierController {

    @Autowired
    CourierService courierService;

    @GetMapping("/api/courier")
    public List<Courier> showAllCouriers() {
        return courierService.getAllCouriers();
    }

    @GetMapping("/api/courier/{id}")
    public Courier getCourierById(@PathVariable Integer id) throws Exception {
        if(id.equals(2)){
            throw new IllegalArgumentException("Nielegalny Argument");
        }
        return courierService.getCourierById(id);
    }
}
