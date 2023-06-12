package com.d3vshub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name="Orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private UUID id;
    private UUID customer_id;
    private Date order_date;

    private Double total;
    private String status;
    private UUID courier_id;
    private UUID delivery_id;

    public Order() {
    }

    public Order(UUID order_id, Customer customer, Date localDate, Double decimal, String status, Courier courier, Delivery delivery) {
        this.id = order_id;
        this.customer_id = customer.getId();
        this.order_date = localDate;
        this.total = decimal;
        this.status = status;
        this.courier_id = courier.getId();
        this.delivery_id = delivery.getId();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(UUID customer_id) {
        this.customer_id = customer_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UUID getCourier_id() {
        return courier_id;
    }

    public void setCourier_id(UUID courier_id) {
        this.courier_id = courier_id;
    }

    public UUID getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(UUID delivery_id) {
        this.delivery_id = delivery_id;
    }
}
