package com.lihini.fueldistribution.schedulerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableKafka
@EntityScan(basePackages = {"com.lihini.fueldistribution.orderservice.model", "com.lihini.fueldistribution.schedulerservice.model",
        "com.lihini.fueldistribution.allocationservice.model"})
public class SchedulerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulerServiceApplication.class, args);

    }

}
