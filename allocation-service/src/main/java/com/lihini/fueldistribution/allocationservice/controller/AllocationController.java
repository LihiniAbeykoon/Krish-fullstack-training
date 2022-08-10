package com.lihini.fueldistribution.allocationservice.controller;

import com.lihini.fueldistribution.allocationservice.model.Allocation;
import com.lihini.fueldistribution.allocationservice.services.AllocationService;
import com.lihini.fueldistribution.allocationservice.services.AllocationServiceImpl;
import com.lihini.fueldistribution.orderservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class AllocationController {

    @Autowired
    AllocationServiceImpl allocationServiceImpl;


}




