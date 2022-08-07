package com.lihini.fueldistribution.allocationservice.model;

import com.lihini.fueldistribution.orderservice.model.Order;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="fuelstock")
public class Allocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long fuelStockID;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId", referencedColumnName = "orderID")
    private Order orderId;
    private String FuelType;
    private int stockCapacity;
    private int availableCapacity;
    private int reservedCapacity;
    private String status;

    public long getFuelStockID() {
        return fuelStockID;
    }

    public void setFuelStockID(long fuelStockID) {
        this.fuelStockID = fuelStockID;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public int getStockCapacity() {
        return stockCapacity;
    }

    public void setStockCapacity(int stockCapacity) {
        this.stockCapacity = stockCapacity;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public int getReservedCapacity() {
        return reservedCapacity;
    }

    public void setReservedCapacity(int reservedCapacity) {
        this.reservedCapacity = reservedCapacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
