package com.d3vshub.repository;

import com.d3vshub.ApplicationConfig;
import com.d3vshub.model.Courier;
import com.d3vshub.repository.CourierRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

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
@RunWith(SpringRunner.class)
public class CourierRepositoryIntegrationTest {
    @Autowired
    private CourierRepository courierRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfCouriers(){
        Courier courier = new Courier( "TEST", "222");
        courierRepository.save(courier);
        System.out.println(courier + "test czy to dziala" +
                "");
    }
}
