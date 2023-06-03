package com.d3vshub.controllers;

import com.d3vshub.api.OrderApi;
import com.d3vshub.model.Customer;
import com.d3vshub.model.Order;
import com.d3vshub.model.Tracking;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class OrderController implements OrderApi {
    @Override
    @PostMapping("/api/orders/new")
    public ResponseEntity<Void> createOrder(Order order) {
        // Implementacja logiki biznesowej dla tworzenia zamówienia
        // Pominąłem logikę w tym przykładzie
        return ResponseEntity.ok().build();
    }
}
