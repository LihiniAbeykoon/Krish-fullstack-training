package com.lihini.fueldistribution.schedulerservice.repository;

import com.lihini.fueldistribution.schedulerservice.model.Scheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SchedulerRepository extends JpaRepository<Scheduler, Integer> {

}
