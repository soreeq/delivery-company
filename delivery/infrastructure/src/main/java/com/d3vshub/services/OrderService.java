package com.d3vshub.services;

import com.d3vshub.model.Order;
import com.d3vshub.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void addOrder(Order order) {
        orderRepository.save(order);
        System.out.println("Zapisano zamowienie");
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order findById(int id) {
        return orderRepository.findById(id);
    }
}
