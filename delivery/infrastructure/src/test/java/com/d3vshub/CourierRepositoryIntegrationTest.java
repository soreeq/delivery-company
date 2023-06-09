package com.d3vshub;

import com.d3vshub.model.Courier;
import com.d3vshub.repository.CourierRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
@WebAppConfiguration
public class CourierRepositoryIntegrationTest {
    @Autowired
    private CourierRepository courierRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfCouriers(){
        Courier courier = new Courier(1, "TEST", "222");
        courierRepository.save(courier);
        System.out.println(courier + "test czy to dziala" +
                "");
    }
}
