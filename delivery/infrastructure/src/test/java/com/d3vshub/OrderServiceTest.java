package com.d3vshub;

import com.d3vshub.model.Order;
import com.d3vshub.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(classes = {ApplicationConfig.class})
@WebAppConfiguration
@RunWith(SpringRunner.class)
public class OrderServiceTest {
    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void orderGetFromDbTest() {
        int orderId = 1; // Przykładowy identyfikator zamówienia

        Order order = orderRepository.findById(orderId);
        if (order != null) {
            int id = order.getId();
            System.out.println("Id zamówienia: " + id);
        } else {
            System.out.println("Zamówienie o podanym id nie został znalezione");
        }
    }


}
