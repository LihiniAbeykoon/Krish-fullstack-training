package com.lihini.fueldistribution.allocationservice.repository;

import com.lihini.fueldistribution.allocationservice.model.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {

//    Allocation findAllocationByOrderId(long orderID);

//    public Allocation checkAvailable(Allocation allocation);

}
