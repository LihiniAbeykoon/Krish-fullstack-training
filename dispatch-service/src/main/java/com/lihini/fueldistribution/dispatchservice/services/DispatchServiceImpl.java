package com.lihini.fueldistribution.dispatchservice.services;

import com.lihini.fueldistribution.allocationservice.model.Allocation;
import com.lihini.fueldistribution.allocationservice.services.AllocationServiceImpl;
import com.lihini.fueldistribution.dispatchservice.model.Dispatch;
import com.lihini.fueldistribution.dispatchservice.model.FuelType;
import com.lihini.fueldistribution.dispatchservice.model.Status;
import com.lihini.fueldistribution.dispatchservice.repository.DispatchRepository;
import com.lihini.fueldistribution.orderservice.model.Order;
import com.lihini.fueldistribution.schedulerservice.model.Scheduler;
import com.lihini.fueldistribution.schedulerservice.services.SchedulerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DispatchServiceImpl implements DispatchService{

    @Autowired
    DispatchRepository dispatchRepository;

    SchedulerServiceImpl schedulerServiceImpl;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public Dispatch save(Dispatch dispatch){

        Scheduler scheduler = new Scheduler();

        if(schedulerServiceImpl.saveSchedule(scheduler)==true) {

            boolean dispatchStatus = checkDispatch();
            if (dispatchStatus == true) {
                dispatch.setStatus(Status.dispatched);
                kafkaTemplate.send("AllocationTopic", scheduler);
            } else {
                dispatch.setStatus(Status.notDispatched);
            }
            return dispatch;
        }
        return dispatch;
    }


    public boolean checkDispatch(){

        int stockCapacity=1000;
        int reserve=500;
        int orderCapacity=100;
        FuelType fuel=null;


        FuelType fuel2 = FuelType.valueOf("petrol92");
        FuelType fuel3 = FuelType.valueOf("petrol95");
        FuelType fuel4 = FuelType.valueOf("diesel");
        FuelType fuel5 = FuelType.valueOf("superdiesel");


        if( fuel==FuelType.petrol92 && stockCapacity>orderCapacity)
        {
            reserve=reserve-orderCapacity;
            stockCapacity=stockCapacity-orderCapacity;
            return true;

        }else if( fuel==FuelType.petrol95 && stockCapacity>orderCapacity)
        {
            reserve=reserve-orderCapacity;
            stockCapacity=stockCapacity-orderCapacity;
            return true;

        }else if( fuel==FuelType.diesel && stockCapacity>orderCapacity)
        {
            reserve=reserve-orderCapacity;
            stockCapacity=stockCapacity-orderCapacity;
            return true;

        }else if( fuel==FuelType.superdiesel && stockCapacity>orderCapacity)
        {
            reserve=reserve-orderCapacity;
            stockCapacity=stockCapacity-orderCapacity;
            return true;

        }else {
            return false;
        }


    }



}

