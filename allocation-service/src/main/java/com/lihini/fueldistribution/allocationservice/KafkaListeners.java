package com.lihini.fueldistribution.allocationservice;

import com.lihini.fueldistribution.allocationservice.services.AllocationServiceImpl;
import com.lihini.fueldistribution.orderservice.model.Order;
import com.lihini.fueldistribution.orderservice.services.OrderServiceImpl;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @Autowired
    AllocationServiceImpl allocationServiceImpl;

    Order order;

    @KafkaListener(
            topics = "OrderTopic",
            groupId = "Id1"
    )
    void listener(String data){
        System.out.println("Listener received" + data);
        //method call

//        allocationServiceImpl.checkAllocation(data);



    }

}
