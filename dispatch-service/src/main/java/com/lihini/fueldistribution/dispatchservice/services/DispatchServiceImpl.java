package com.lihini.fueldistribution.dispatchservice.services;

import com.lihini.fueldistribution.dispatchservice.model.Dispatch;
import com.lihini.fueldistribution.dispatchservice.model.FuelType;
import com.lihini.fueldistribution.dispatchservice.model.Status;
import com.lihini.fueldistribution.dispatchservice.repository.DispatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DispatchServiceImpl implements DispatchService{

    @Autowired
    DispatchRepository dispatchRepository;

    public Dispatch checkDispatch(Dispatch dispatch){
        int stockCapacity=1000;
        int reserve=500;
        int orderCapacity=100;
        Status status;

        FuelType fuel = FuelType.valueOf("petrol92");
        FuelType fuel2 = FuelType.valueOf("petrol92");
        FuelType fuel3 = FuelType.valueOf("petrol95");
        FuelType fuel4 = FuelType.valueOf("diesel");
        FuelType fuel5 = FuelType.valueOf("superdiesel");


        if( fuel==fuel2 && stockCapacity>orderCapacity)
        {
            reserve=reserve-orderCapacity;
            stockCapacity=stockCapacity-orderCapacity;
            status= Status.dispatched;


        }else if( fuel==fuel3 && stockCapacity>orderCapacity)
        {
            reserve=reserve-orderCapacity;
            stockCapacity=stockCapacity-orderCapacity;
            status= Status.dispatched;


        }else if( fuel==fuel4 && stockCapacity>orderCapacity)
        {
            reserve=reserve-orderCapacity;
            stockCapacity=stockCapacity-orderCapacity;
            status= Status.dispatched;


        }else if( fuel==fuel5 && stockCapacity>orderCapacity)
        {
            reserve=reserve-orderCapacity;
            stockCapacity=stockCapacity-orderCapacity;
            status= Status.dispatched;

        }else {
            status=Status.notDispatched;
        }
        return dispatch;

    }

    public Dispatch getStatus(long orderID){

        //reservation ok()if else
        Dispatch dispatch=dispatchRepository.findDispatchByOrderId(orderID);
        Status status= Status.dispatched;
        dispatch.setStatus(status.toString());
        return dispatch;

    }



}

