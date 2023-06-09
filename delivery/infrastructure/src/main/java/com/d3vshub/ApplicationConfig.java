package com.d3vshub;

import com.d3vshub.controllers.CustomerController;
import com.d3vshub.controllers.OrderController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.d3vshub")
public class ApplicationConfig {

/*    @Bean
    public CustomerController customerController(){
        return new CustomerController();
    };

    @Bean
    public OrderController orderController(){
        return new OrderController();
    }*/

}
