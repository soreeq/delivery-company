package com.d3vshub.controllers;

import com.d3vshub.api.OrderApi;
import com.d3vshub.model.Order;
import com.d3vshub.openapi.api.ApiApiDelegate;
import com.d3vshub.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController implements OrderApi, ApiApiDelegate {

    @Autowired
    private OrderService orderService;


    @GetMapping("/api/orders")
    public List<Order> getAllOrders(){
        return  orderService.getAllOrders();

    }
    @Override
    @PostMapping("/api/orders/new")
    public ResponseEntity<Void> createOrder(Order order) {
        orderService.addOrder(order);
        return ResponseEntity.ok().build();
    }


}
