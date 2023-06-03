package com.d3vshub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="Tracking")
public class Tracking {

    @Id
    @Column(name = "TRACKING_ID")
    private int id;

    private int order_id;
    private Date delivery_date;
    private String status;

    public Tracking(int id, Order order, Date date, String status) {
        this.id = id;
        this.order_id = order.getId();
        this.delivery_date = date;
        this.status = status;
    }

    public Tracking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
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
