package com.d3vshub;

import com.d3vshub.model.Courier;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class CourierControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    Flyway flyway;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void shouldReturnSelectedCourier() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/get/couriers"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful()).andReturn();

        Courier[] couriers = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), Courier[].class);

        Assertions.assertEquals(1, couriers[0].getId());
    }
}
