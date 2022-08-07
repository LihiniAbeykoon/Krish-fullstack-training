package com.lihini.fueldistribution.schedulerservice.services;

import com.lihini.fueldistribution.schedulerservice.model.Scheduler;
import com.lihini.fueldistribution.schedulerservice.repository.SchedulerRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.FixedRateTask;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


@Service
public class SchedulerServiceImpl implements SchedulerService{

    @Autowired
    SchedulerRepository schedulerRepository;

    public LocalDate scheduleDate() {
        long start = LocalDate.now().toEpochDay();
        long end = LocalDate.ofEpochDay(60).toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(start, end);

        return LocalDate.ofEpochDay(randomDay);
    }

    @Override
    public Scheduler save(Scheduler scheduler){
        return schedulerRepository.save(scheduler);
    }

//    @Override
//    public List<Scheduler> findAll(){
//        return schedulerRepository.findAll();
//    }
    
}
