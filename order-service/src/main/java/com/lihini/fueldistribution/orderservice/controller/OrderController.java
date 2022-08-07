package com.lihini.fueldistribution.orderservice.controller;

import com.lihini.fueldistribution.orderservice.model.Order;
import com.lihini.fueldistribution.orderservice.repository.OrderRepository;
import com.lihini.fueldistribution.orderservice.services.OrderService;
import com.lihini.fueldistribution.orderservice.services.OrderServiceImpl;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/save")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class OrderController {

    @Autowired
    OrderService orderService;

    OrderServiceImpl orderServiceImpl;


    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public Order save(@RequestBody Order order){

        return orderService.save(order);
    }


//    @PostMapping("/pushMessage")
//    public String postMessage(@RequestBody String message){
//        orderServiceImpl.sendMessage(message);
//        return "Message published";
//    }


    @GetMapping
    public List<Order> findAll(){
        return orderService.findAll();
    }



}
