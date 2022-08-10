package com.lihini.fueldistribution.allocationservice.services;

import com.lihini.fueldistribution.allocationservice.model.Allocation;
import com.lihini.fueldistribution.allocationservice.model.FuelType;
import com.lihini.fueldistribution.allocationservice.model.Status;
import com.lihini.fueldistribution.allocationservice.repository.AllocationRepository;
import com.lihini.fueldistribution.orderservice.model.Order;
import com.lihini.fueldistribution.orderservice.services.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AllocationServiceImpl implements AllocationService {

    @Autowired
    AllocationRepository allocationRepository;


    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    //to take order method()
    public boolean checkAllocation(Order order){
        Order order1= new Order();
        int orderCapacity=order1.getCapacity();
        String fuel= order1.getFuelType();
        Allocation allocation=new Allocation();
        if(checkAvailable(orderCapacity,fuel)==true){
            allocation.setStatus(Status.Allocated);
            kafkaTemplate.send("AllocationTopic", order1);
            return true;
        }else{
            allocation.setStatus(Status.NotAllocated);
            kafkaTemplate.send("AllocationTopic", order1);
            return false;
        }

//string->order


    }

    public boolean checkAvailable(int orderCapacity, String fuel) {//give a parameter needed

        int stockCapacity92 = 20000;
        int stockCapacity95 = 20000;
        int stockCapacityDiesel = 20000;
        int stockCapacitySuperDiesel = 20000;

        int availableCapacity92 = 20000;
        int availableCapacity95 = 20000;
        int availableCapacityDiesel = 20000;
        int availableCapacitySuperDiesel = 20000;

        int reserve = 0;

        String fuel2 = "petrol92";
        String fuel3 = "petrol95";
        String fuel4 = "diesel";
        String fuel5 = "superdiesel";


        if (fuel == fuel2) {
            if (stockCapacity92 > orderCapacity && availableCapacity92 > orderCapacity) {
                availableCapacity92 = availableCapacity92 - orderCapacity;
                reserve = reserve + orderCapacity;
                return true;
            } else {
                return false;
            }
        }
        else if (fuel == fuel3) {
            if (stockCapacity95 > orderCapacity && availableCapacity95 > orderCapacity) {
                availableCapacity95 = availableCapacity95 - orderCapacity;
                reserve = reserve + orderCapacity;
                return true;
            } else {
                return false;
            }
        }
        else if (fuel == fuel4) {
            if (stockCapacityDiesel > orderCapacity && availableCapacityDiesel > orderCapacity) {
                availableCapacityDiesel = availableCapacityDiesel - orderCapacity;
                reserve = reserve + orderCapacity;
                return true;
            } else {
                return false;
            }
        }
        else if (fuel == fuel5) {
            if (stockCapacitySuperDiesel > orderCapacity && availableCapacitySuperDiesel > orderCapacity) {
                availableCapacitySuperDiesel = availableCapacitySuperDiesel - orderCapacity;
                reserve = reserve + orderCapacity;
                return true;
            } else {
                return false;
            }
        }else{
            System.out.println("Incorrect FuelType");
            return false;
        }
    }

}




