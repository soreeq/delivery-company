package com.d3vshub;

import com.d3vshub.model.Order;
import com.d3vshub.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

@RunWith(SpringRunner.class)
@DataJpaTest
public class OrderRepositoryIntegrationTest {
    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void shouldReturnOrder(){
        System.out.println(orderRepository.findById(1));

    }
}
