package com.lihini.fueldistribution.orderservice.services;

import com.lihini.fueldistribution.orderservice.model.Order;

import java.util.List;


public interface OrderService {

    Order save(Order order);

    List<Order> findAll();




}
