package com.d3vshub.mappers;

import com.d3vshub.dto.CourierDTO;
import com.d3vshub.dto.CustomerDTO;
import com.d3vshub.model.Courier;
import com.d3vshub.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourierMapper {
    CourierDTO sourceToDestination(Courier courier);
    Courier destinationToSource(CourierDTO CourierDTO);
}
