package com.sham.feign.controller;

import com.sham.feign.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    DemoClient demoClient;
    @RequestMapping(value = "mm")
    public String feignSay(){
        return demoClient.sayhi();
    }
}
