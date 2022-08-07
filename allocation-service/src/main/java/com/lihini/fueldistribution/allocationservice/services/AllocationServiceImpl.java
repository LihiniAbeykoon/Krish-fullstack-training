package com.lihini.fueldistribution.allocationservice.services;

import com.lihini.fueldistribution.allocationservice.model.Allocation;
import com.lihini.fueldistribution.allocationservice.model.FuelType;
import com.lihini.fueldistribution.allocationservice.model.Status;
import com.lihini.fueldistribution.allocationservice.repository.AllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllocationServiceImpl implements AllocationService {

    @Autowired
    AllocationRepository allocationRepository;


    public Allocation checkAvailable(Allocation allocation){

        int stockCapacity=1000;
        int available=1000;
        int reserve=0;
        int orderCapacity=100;
        Status status;

        FuelType fuel = FuelType.valueOf("petrol92");
        FuelType fuel2 = FuelType.valueOf("petrol92");
        FuelType fuel3 = FuelType.valueOf("petrol95");
        FuelType fuel4 = FuelType.valueOf("diesel");
        FuelType fuel5 = FuelType.valueOf("superdiesel");



        if( fuel==fuel2 && available>orderCapacity && stockCapacity>orderCapacity)
            {
                reserve=reserve+orderCapacity;
                available=available-orderCapacity;
                status=Status.Allocated;

            }else if(fuel==fuel3 && available>orderCapacity && stockCapacity>orderCapacity)
            {
                reserve=reserve+orderCapacity;
                available=available-orderCapacity;
                status=Status.Allocated;
            }else if(fuel==fuel4 && available>orderCapacity && stockCapacity>orderCapacity)
            {
                reserve=reserve+orderCapacity;
                available=available-orderCapacity;
                status=Status.Allocated;
            }else if(fuel==fuel5 && available>orderCapacity && stockCapacity>orderCapacity)
            {
                reserve=reserve+orderCapacity;
                available=available-orderCapacity;
                status=Status.Allocated;
            }else {
            status=Status.NotAllocated;
        }


        return allocationRepository.save(allocation);

    }

    public Allocation getStatus(long orderID){

        Allocation allocation=allocationRepository.findAllocationByOrderId(orderID);
        Status status= Status.Allocated;
        allocation.setStatus(status.toString());
        return allocation;

    }








}
