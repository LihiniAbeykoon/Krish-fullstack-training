package com.lihini.fueldistribution.dispatchservice;

import com.lihini.fueldistribution.allocationservice.services.AllocationServiceImpl;
import com.lihini.fueldistribution.dispatchservice.services.DispatchServiceImpl;
import com.lihini.fueldistribution.orderservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @Autowired
    DispatchServiceImpl dispatchServiceImpl;


    @KafkaListener(
            topics = "ScheduleTopic",
            groupId = "Id3"
    )
    void listener(String data){
        System.out.println("Listener received" + data);
        //method call

    }

}
