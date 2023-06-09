package com.d3vshub.repository;

import com.d3vshub.ApplicationConfig;
import com.d3vshub.model.Courier;
import com.d3vshub.model.Order;
import com.d3vshub.repository.OrderRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
@WebAppConfiguration
@AutoConfigureMockMvc
@SqlGroup({
        @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {
                "/sql/initialization.sql"
        })
})

public class OrderRepositoryIntegrationTest {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void shouldReturnOrder() throws Exception {
        orderRepository.findById(1);

        MvcResult mvcResult = mockMvc.perform(get("/api/orders")).andExpect(MockMvcResultMatchers.status().is2xxSuccessful()).andReturn();

        Order[] orders = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), Order[].class);

        Assertions.assertEquals(1, orders[0].getId());
    }
}
