package com.lihini.fueldistribution.schedulerservice.model;

import com.lihini.fueldistribution.orderservice.model.Order;

import javax.persistence.*;


@Entity
@Table(name="scheuler")
public class Scheduler {

    @Id
    @GeneratedValue
    private String scheduleId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId", referencedColumnName = "orderID")
    private Order orderId;
    private String dateCreated;

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
