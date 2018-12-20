package com.haiyu.client.hystrix;

import com.haiyu.client.feign.ServerFeign;
import org.springframework.stereotype.Component;
@Component
public class ServerHystrix implements ServerFeign {
    @Override
    public String hello(String name) {
        System.out.println("------lalalla------");
        return name + " 失败了";
    }
}
