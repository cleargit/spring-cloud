package com.sham.provide.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${server.port}")
    String port;
    @Value("${neo.hello}")
    String say;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayhi(){
        return "hi"+port+"/n"+say;
    }
}
