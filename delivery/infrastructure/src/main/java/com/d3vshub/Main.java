package com.d3vshub;

import com.d3vshub.repository.CustomerRepository;
import com.d3vshub.services.CourierService;
import com.d3vshub.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.d3vshub"})
@EnableAutoConfiguration
@EnableTransactionManagement
public class Main {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);


    }
}