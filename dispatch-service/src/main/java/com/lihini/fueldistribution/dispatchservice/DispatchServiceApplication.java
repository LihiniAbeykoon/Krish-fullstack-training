package com.lihini.fueldistribution.dispatchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@EntityScan(basePackages = {"com.lihini.fueldistribution.scheduleservice.model","com.lihini.fueldistribution.dispatchservice.model",
        "com.lihini.fueldistribution.orderservice.model"})
public class DispatchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DispatchServiceApplication.class, args);
    }

}
