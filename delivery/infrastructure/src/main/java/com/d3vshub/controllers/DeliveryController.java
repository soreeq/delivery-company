package com.d3vshub.controllers;

import com.d3vshub.api.DeliveryApi;
import com.d3vshub.model.Delivery;
import com.d3vshub.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeliveryController implements DeliveryApi {
    @Autowired
    DeliveryRepository deliveryRepository;
    @Override
    @GetMapping("/api/deliveries")
    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }
}
