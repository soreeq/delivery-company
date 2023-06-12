//package com.d3vshub.service;
//
//import com.d3vshub.ApplicationConfig;
//import com.d3vshub.model.Customer;
//import com.d3vshub.repository.CustomerRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.context.jdbc.SqlGroup;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//@ContextConfiguration(classes = {ApplicationConfig.class})
//@WebAppConfiguration
//@AutoConfigureMockMvc
//@SqlGroup({
//        @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {
//                "/sql/drop_schema.sql",
//                "/sql/create_schema.sql",
//                "/sql/initialization.sql",
//        })
//})
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class CustomerServiceTest {
//    @Autowired
//    private CustomerRepository customerRepository;
//
//    @Test
//    public void customerGetFromDbTest() {
//
//        String customerName = "John";
//
//        Customer customer = customerRepository.findByName(customerName);
//        if (customer != null) {
//            String name = customer.getFirst_name();
//            // Wywołanie id klienta
//            System.out.println("Nazwa klienta: " + name);
//        } else {
//            System.out.println("Klient o podanej nazwie nie został znaleziony");
//        }
//    }
//
//}
