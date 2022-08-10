package com.lihini.fueldistribution.schedulerservice.services;


import com.lihini.fueldistribution.schedulerservice.model.Scheduler;

import java.util.List;


public interface SchedulerService {

    public List<Scheduler> getAll();

    public boolean saveSchedule(Scheduler scheduler);

//    public Scheduler scheduleDate(int scheduleId);



}
