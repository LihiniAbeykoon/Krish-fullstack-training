package com.lihini.fueldistribution.schedulerservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "AllocationTopic",
            groupId = "Id2"
    )
    void listener(String data){
        System.out.println("Listener received" + data);

    }

}
