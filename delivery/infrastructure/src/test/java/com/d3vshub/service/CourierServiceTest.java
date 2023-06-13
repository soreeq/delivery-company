//package com.d3vshub.service;
//
//import com.d3vshub.config.ApplicationConfig;
//import com.d3vshub.model.Courier;
//import com.d3vshub.repository.CourierRepository;
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
//import java.util.UUID;
//
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
//public class CourierServiceTest {
//
//    @Autowired
//    private CourierRepository courierRepository;
//
//    @Test
//    public void courierGetFromDbTest() {
//        int courierId = 1; // Przykładowy identyfikator kuriera
//
//        Courier courier = courierRepository.findById(courierId);
//        if (courier != null) {
//            UUID id = courier.getId();
//            // Wywołanie id kuriera
//            System.out.println("Id kuriera: " + id);
//        } else {
//            System.out.println("Kurier o podanym id nie został znaleziony");
//        }
//    }
//
//}
