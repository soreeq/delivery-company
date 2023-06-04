package com.d3vshub.mappers;

import com.d3vshub.dto.CustomerDTO;
import com.d3vshub.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO sourceToDestination(Customer customer);
    Customer destinationToSource(CustomerDTO customerDTO);

}
