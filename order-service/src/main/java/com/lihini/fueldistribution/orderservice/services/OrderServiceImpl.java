package com.lihini.fueldistribution.orderservice.services;

import com.lihini.fueldistribution.orderservice.model.Order;
import com.lihini.fueldistribution.orderservice.repository.OrderRepository;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@EnableAutoConfiguration
@Service
public class OrderServiceImpl implements OrderService{



    @Autowired
    OrderRepository orderRepository;

    KafkaTemplate<String, String> kafkaTemplate;



    @Override
    public Order save(Order order){
        kafkaTemplate.send("lihiniB","hello kafka");
        return orderRepository.save(order);

    }



    public List<Order> findAll(){
        return orderRepository.findAll();
    }

}
