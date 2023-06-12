package com.d3vshub.controllers;

import com.d3vshub.api.DeliveryApi;
import com.d3vshub.model.Delivery;
import com.d3vshub.repository.DeliveryRepository;
import com.d3vshub.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryController implements DeliveryApi {
    @Autowired
    DeliveryService deliveryService;
    @Override
    @GetMapping("/api/delivery")
    public List<Delivery> getAllDelivery() {
        return deliveryService.findAll();
    }

    @GetMapping("/api/delivery/{id}")
    public Delivery getDeliveryById(@PathVariable int id){ return deliveryService.findById(id);}

    @PostMapping("/api/delivery/new")
    public ResponseEntity<Void> addNewDelivery(@RequestBody Delivery delivery) {deliveryService.addNewDelivery(delivery);
        return ResponseEntity.ok().build();
    }
}
