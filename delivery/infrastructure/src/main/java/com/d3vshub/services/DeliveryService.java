package com.d3vshub.services;

import com.d3vshub.model.Delivery;
import com.d3vshub.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;
    public List<Delivery> findAll() {
       return deliveryRepository.findAll();
    }

    public void addNewDelivery(Delivery delivery){
        deliveryRepository.save(delivery);
    }

    public Delivery findById(int id) {
        return deliveryRepository.findById(id);
    }
}
