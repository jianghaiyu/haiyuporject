package com.haiyu.client.controller;

import com.haiyu.client.feign.ServerFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/client")
@RestController
public class HelloController {
    @Autowired
    private ServerFeign serverFeign;
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String hello(){
//        logger.info("====来请求啦===");
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            logger.error(" hello two error",e);
//        }
        return serverFeign.hello("haiyu");
    }
}
