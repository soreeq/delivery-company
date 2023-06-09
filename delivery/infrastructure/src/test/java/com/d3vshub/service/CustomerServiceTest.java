package com.d3vshub.service;

import com.d3vshub.ApplicationConfig;
import com.d3vshub.model.Customer;
import com.d3vshub.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
@WebAppConfiguration
public class CustomerServiceTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void customerGetFromDbTest() {
        int customerId = 1; // Przykładowy identyfikator kuriera

        Customer customer = customerRepository.findById(customerId);
        if (customer != null) {
            int id = customer.getId();
            // Wywołanie id klienta
            System.out.println("Id klienta: " + id);
        } else {
            System.out.println("Klient o podanym id nie został znaleziony");
        }
    }

}
