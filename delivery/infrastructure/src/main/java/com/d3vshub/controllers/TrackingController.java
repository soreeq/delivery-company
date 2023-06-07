package com.d3vshub.controllers;

import com.d3vshub.api.TrackingApi;
import com.d3vshub.model.Tracking;
import com.d3vshub.repository.TrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackingController implements TrackingApi {
    @Autowired
    TrackingRepository trackingRepository;
    @Override
    @GetMapping("/api/get/trackings")
    public List<Tracking> listOfTracking() {
        return trackingRepository.findAll();

    }
}
