package com.lihini.fueldistribution.dispatchservice.repository;

import com.lihini.fueldistribution.dispatchservice.model.Dispatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchRepository extends JpaRepository<Dispatch, String> {

    Dispatch findDispatchByOrderId(long orderID);
}
