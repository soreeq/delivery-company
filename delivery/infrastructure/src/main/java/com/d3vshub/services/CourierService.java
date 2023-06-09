package com.d3vshub.services;

import com.d3vshub.model.Courier;
import com.d3vshub.model.Order;
import com.d3vshub.repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class CourierService {

    @Autowired
    CourierRepository courierRepository;

    public List<Courier> getAllCouriers(){
        System.out.println(courierRepository.findAll());
        return courierRepository.findAll();
    }

    public Courier getCourierById(int id) {
        return courierRepository.findById(id);
    }
}
