package com.lihini.fueldistribution.schedulerservice.services;


import com.lihini.fueldistribution.schedulerservice.model.Scheduler;

import java.time.LocalDate;
import java.util.List;


public interface SchedulerService {

     LocalDate scheduleDate();

     Scheduler save(Scheduler scheduler);

//     List<Scheduler> findAll();



}
