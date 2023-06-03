package com.d3vshub.api;

import com.d3vshub.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface OrderApi {
    @PostMapping("/api/orders")
    ResponseEntity<Void> createOrder(@RequestBody Order order);
}
