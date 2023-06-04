package com.d3vshub;

import com.d3vshub.dto.CustomerDTO;
import com.d3vshub.mappers.CustomerMapper;
import com.d3vshub.model.Customer;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerMapperIntegrationTest {
    private CustomerMapper mapper = Mappers.getMapper(CustomerMapper.class);

    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        Customer customer = new Customer();
        customer.setFirst_name("CustomerName");
        customer.setLast_name("CustomerName");
        customer.setEmail("customer@example.com");

        CustomerDTO destination = mapper.sourceToDestination(customer);

        assertEquals(customer.getFirst_name(), destination.getFirst_name());
        assertEquals(customer.getEmail(), destination.getEmail());
    }

    @Test
    public void givenDestinationToSource_whenMaps_thenCorrect() {
        CustomerDTO destination = new CustomerDTO();
        destination.setFirst_name("DestinationName");
        destination.setLast_name("DestinationName");
        destination.setEmail("destination@example.com");

        Customer source = mapper.destinationToSource(destination);

        assertEquals(destination.getFirst_name(), source.getFirst_name());
        assertEquals(destination.getEmail(), source.getEmail());
    }


}
