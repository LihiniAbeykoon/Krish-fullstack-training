package com.lihini.fueldistribution.schedulerservice.services;

import com.lihini.fueldistribution.allocationservice.services.AllocationServiceImpl;
import com.lihini.fueldistribution.orderservice.model.Order;
import com.lihini.fueldistribution.orderservice.services.OrderServiceImpl;
import com.lihini.fueldistribution.schedulerservice.model.Scheduler;
import com.lihini.fueldistribution.schedulerservice.repository.SchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;


@Service
public class SchedulerServiceImpl implements SchedulerService{

    @Autowired
    SchedulerRepository schedulerRepository;

    AllocationServiceImpl allocationServiceImpl;


    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;


    public boolean saveSchedule(Scheduler scheduler){
        //kafkamethod(order)
        Order order1=new Order();
        if(allocationServiceImpl.checkAllocation(order1)==true){
            scheduler.setDateCreated(LocalDate.now().plusDays(2));
            scheduler.setScheduleStatus("Scheduled");
            schedulerRepository.save(scheduler);
            kafkaTemplate.send("ScheduleTopic", order1);
            return true;
        }else {
           return false;
        }

    }


    public List<Scheduler> getAll(){
        List<Scheduler> schedulerList= schedulerRepository.findAll();
        return schedulerList;
    }


    
}
