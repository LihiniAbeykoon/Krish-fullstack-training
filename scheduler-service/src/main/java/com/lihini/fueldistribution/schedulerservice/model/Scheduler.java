package com.lihini.fueldistribution.schedulerservice.model;

import ch.qos.logback.core.status.Status;
import com.lihini.fueldistribution.orderservice.model.Order;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="scheduler")
public class Scheduler {

    @Id
    @GeneratedValue
    private int scheduleId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId", referencedColumnName = "orderID")
    private Order orderId;
    private String scheduleStatus;
    private LocalDate dateCreated;

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
