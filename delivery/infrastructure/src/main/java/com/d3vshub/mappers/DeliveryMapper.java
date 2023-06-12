package com.d3vshub.mappers;

import com.d3vshub.dto.CustomerDTO;
import com.d3vshub.dto.DeliveryDTO;
import com.d3vshub.model.Customer;
import com.d3vshub.model.Delivery;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DeliveryMapper {
    DeliveryDTO sourceToDestination(Delivery delivery);
    Delivery destinationToSource(DeliveryDTO deliveryDTO);
}
