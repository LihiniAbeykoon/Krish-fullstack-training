package com.lihini.fueldistribution.schedulerservice.controller;

import com.lihini.fueldistribution.orderservice.model.Order;
import com.lihini.fueldistribution.schedulerservice.model.Scheduler;
import com.lihini.fueldistribution.schedulerservice.services.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api/scheduler")
public class SchedulerController {

    @Autowired
    SchedulerService schedulerService;

    @GetMapping(path = "/All")
    public List<Scheduler> getAllSchedules() {
        List<Scheduler> schedulerList= schedulerService.getAll();
        return schedulerList;

    }

    @PostMapping(path = "/saveSchedule")
    public boolean saveSchedule(@RequestBody Scheduler scheduler){
        boolean scheduler1= schedulerService.saveSchedule(scheduler);
        return scheduler1;
    }












}
