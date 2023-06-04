package com.d3vshub;

import com.d3vshub.model.Courier;
import com.d3vshub.model.Customer;
import com.d3vshub.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.d3vshub"})
@EnableAutoConfiguration
public class Main {
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);

    }
}