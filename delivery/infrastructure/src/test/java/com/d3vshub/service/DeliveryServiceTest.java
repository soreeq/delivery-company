package com.d3vshub.service;

import com.d3vshub.ApplicationConfig;
import com.d3vshub.model.Delivery;
import com.d3vshub.repository.DeliveryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
@WebAppConfiguration
@AutoConfigureMockMvc
@SqlGroup({
        @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {
                "/sql/drop_schema.sql",
                "/sql/create_schema.sql",
                "/sql/initialization.sql",
        })
})
@SpringBootTest
public class DeliveryServiceTest {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Test
    public void deliveryGetFromDbTest() {
        int derliveryId = 1; // Przykładowy identyfikator dostawy

        Delivery derlivery = deliveryRepository.findById(derliveryId);
        if (derlivery != null) {
            int id = derlivery.getId();
            // Wywołanie id dostawy
            System.out.println("Id dostawy: " + id);
        } else {
            System.out.println("Dostawa o podanym id nie został znaleziona");
        }
    }

}
