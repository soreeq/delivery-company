package com.d3vshub.mappers;

import com.d3vshub.dto.CustomerDTO;
import com.d3vshub.dto.OrderDTO;
import com.d3vshub.model.Customer;
import com.d3vshub.model.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO sourceToDestination(Order order);
    Order destinationToSource(OrderDTO OrderDTO);

}
