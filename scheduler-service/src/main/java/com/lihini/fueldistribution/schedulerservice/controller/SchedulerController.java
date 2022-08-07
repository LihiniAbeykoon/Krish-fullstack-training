package com.lihini.fueldistribution.schedulerservice.controller;

import com.lihini.fueldistribution.schedulerservice.model.Scheduler;
import com.lihini.fueldistribution.schedulerservice.services.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("api/scheduler")
public class SchedulerController {

    @Autowired
    SchedulerService schedulerService;

    @GetMapping(path = "/All")
    public LocalDate getAllSchedules(){
       LocalDate schedulerList = schedulerService.scheduleDate();
       return schedulerList;
    }

    @PostMapping(path = "/saveSchedule")
    public LocalDate save(@RequestBody Scheduler scheduler){
        return schedulerService.scheduleDate();
    }

//    @PutMapping("/update")
//    public List<Scheduler> findAll(){
//        return schedulerService.findAll();
//    }








}
