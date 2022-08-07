package com.lihini.fueldistribution.orderservice.repository;

import com.lihini.fueldistribution.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long > {
}
