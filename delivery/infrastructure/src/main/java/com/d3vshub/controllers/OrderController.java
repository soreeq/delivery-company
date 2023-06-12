package com.d3vshub.controllers;

import com.d3vshub.model.Order;
import com.d3vshub.openapi.api.ApiApiDelegate;
import com.d3vshub.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController implements ApiApiDelegate {

    @Autowired
    private OrderService orderService;


    @GetMapping("/api/order")
    public List<Order> getAllOrders(){
        return  orderService.getAllOrders();

    }
    @GetMapping("/api/order/{id}")
    public Order findOrderById(@PathVariable int id){
        return orderService.findById(id);
    }
    @PostMapping("/api/order/new")
    public ResponseEntity<Void> createOrder(Order order) {
        orderService.addOrder(order);
        return ResponseEntity.ok().build();
    }


}
