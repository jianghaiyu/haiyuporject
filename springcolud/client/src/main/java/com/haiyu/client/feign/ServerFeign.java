package com.haiyu.client.feign;

import com.haiyu.client.hystrix.ServerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-server",fallback = ServerHystrix.class)
public interface ServerFeign {
    @RequestMapping("/test/hello")
    public String hello(@RequestParam(value = "name") String name);
}
