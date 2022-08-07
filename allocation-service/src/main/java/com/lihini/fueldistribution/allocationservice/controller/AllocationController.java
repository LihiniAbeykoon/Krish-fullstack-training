package com.lihini.fueldistribution.allocationservice.controller;

import com.lihini.fueldistribution.allocationservice.model.Allocation;
import com.lihini.fueldistribution.allocationservice.services.AllocationService;
import com.lihini.fueldistribution.allocationservice.services.AllocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllocationController {

    @Autowired
    AllocationServiceImpl allocationServiceImpl;

    @GetMapping("/getstatus/{id}")
    public Allocation getStatus(@PathVariable("id") long orderID ){
        Allocation allocation= allocationServiceImpl.getStatus(orderID);
        return allocation;
    };



}
