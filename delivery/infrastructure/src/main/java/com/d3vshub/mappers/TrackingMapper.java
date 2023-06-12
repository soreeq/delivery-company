package com.d3vshub.mappers;

import com.d3vshub.dto.TrackingDTO;
import com.d3vshub.model.Tracking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TrackingMapper {
    TrackingDTO sourceToDestination(Tracking tracking);
    Tracking destinationToSource(TrackingDTO trackingDTO);
}
