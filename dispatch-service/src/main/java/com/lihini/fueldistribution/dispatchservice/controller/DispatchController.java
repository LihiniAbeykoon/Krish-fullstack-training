package com.lihini.fueldistribution.dispatchservice.controller;

import com.lihini.fueldistribution.dispatchservice.model.Dispatch;
import com.lihini.fueldistribution.dispatchservice.services.DispatchService;
import com.lihini.fueldistribution.dispatchservice.services.DispatchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DispatchController {


    @Autowired
    DispatchServiceImpl dispatchServiceImpl;

    @GetMapping("/getstatus/{id}")
    public Dispatch getStatus(@PathVariable ("id") long orderID ){
        Dispatch dispatch= dispatchServiceImpl.getStatus(orderID);
        return dispatch;
    };

    //getmapp

    //post btn click





}
