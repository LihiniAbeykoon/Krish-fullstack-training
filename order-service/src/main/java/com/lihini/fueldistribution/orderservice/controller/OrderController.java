package com.lihini.fueldistribution.orderservice.controller;

import com.lihini.fueldistribution.orderservice.model.Order;
import com.lihini.fueldistribution.orderservice.repository.OrderRepository;
import com.lihini.fueldistribution.orderservice.services.OrderService;
import com.lihini.fueldistribution.orderservice.services.OrderServiceImpl;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/save")
@EnableAutoConfiguration
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderServiceImpl orderServiceImpl;

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;


    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public Order save(@RequestBody Order order){
        Order order1= orderService.save(order);
        kafkaTemplate.send("OrderTopic", order);
        return order1;
    }



    @GetMapping
    public List<Order> findAll(){
        return orderService.findAll();
    }



}
