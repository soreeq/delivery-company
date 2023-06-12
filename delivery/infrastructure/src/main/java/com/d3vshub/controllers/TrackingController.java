package com.d3vshub.controllers;

import com.d3vshub.api.TrackingApi;
import com.d3vshub.model.Tracking;
import com.d3vshub.repository.TrackingRepository;
import com.d3vshub.services.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackingController implements TrackingApi {
    @Autowired
    TrackingService trackingService;
    @Override
    @GetMapping("/api/tracking")
    public List<Tracking> listOfTracking() {
        return trackingService.findAll();
    }
    @GetMapping("/api/tracking/{id}")
    public Tracking getTrackingById(@PathVariable int id){
        return trackingService.findById(id);
    }
}
