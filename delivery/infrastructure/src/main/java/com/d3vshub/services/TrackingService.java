package com.d3vshub.services;

import com.d3vshub.model.Tracking;
import com.d3vshub.repository.TrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackingService {
    @Autowired
    TrackingRepository trackingRepository;

    public List<Tracking> findAll() {
        return trackingRepository.findAll();
    }

    public Tracking findById(int id) {
        return trackingRepository.findById(id);
    }
}
