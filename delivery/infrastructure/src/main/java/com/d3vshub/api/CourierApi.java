package com.d3vshub.api;

import com.d3vshub.model.Courier;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CourierApi {

    public List<Courier> showAllCouriers();
}
