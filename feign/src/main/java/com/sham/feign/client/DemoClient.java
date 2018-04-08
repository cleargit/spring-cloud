package com.sham.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "server-hi",fallback = FailedBack.class)
public interface DemoClient {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayhi();
}
