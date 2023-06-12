package com.d3vshub.dto;

import com.d3vshub.model.Order;

import java.sql.Date;
import java.util.UUID;

public class TrackingDTO {

    private UUID id;
    private UUID order_id;
    private Date delivery_date;
    private String status;

    public TrackingDTO(UUID id, Order order, Date date, String status) {
        this.id = id;
        this.order_id = order.getId();
        this.delivery_date = date;
        this.status = status;
    }

    public TrackingDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getOrder_id() {
        return order_id;
    }

    public void setOrder_id(UUID order_id) {
        this.order_id = order_id;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
