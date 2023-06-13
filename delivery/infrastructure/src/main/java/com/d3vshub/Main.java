package com.d3vshub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.d3vshub"})
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableScheduling
public class Main {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);


    }
}