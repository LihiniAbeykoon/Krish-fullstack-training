package com.lihini.fueldistribution.allocationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@EntityScan(basePackages = {"com.lihini.fueldistribution.orderservice.model", "com.lihini.fueldistribution.allocationservice.model"})
public class AllocationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllocationServiceApplication.class, args);
    }

}
