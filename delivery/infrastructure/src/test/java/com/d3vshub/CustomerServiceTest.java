package com.d3vshub;

import com.d3vshub.model.Customer;
import com.d3vshub.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
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
