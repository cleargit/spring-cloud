package com.sham.feign.client;

import org.springframework.stereotype.Component;

@Component
public class FailedBack implements DemoClient {
    @Override
    public String sayhi() {
        return "sorry have fail";
    }
}
