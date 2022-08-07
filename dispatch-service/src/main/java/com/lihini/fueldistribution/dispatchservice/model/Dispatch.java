package com.lihini.fueldistribution.dispatchservice.model;

import com.lihini.fueldistribution.orderservice.model.Order;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dispatch")
public class Dispatch {

    @Id
    @GeneratedValue
    private String dispatchId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId", referencedColumnName = "orderID")
    private Order orderId;
    private String dispatchDate;
    private String status;

    public String getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public String getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(String dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
