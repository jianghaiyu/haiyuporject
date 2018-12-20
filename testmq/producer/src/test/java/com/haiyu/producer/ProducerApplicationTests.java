package com.haiyu.producer;


import com.haiyu.entity.Order;
import com.haiyu.producer.producer.OrderSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerApplicationTests {
    @Autowired
    private OrderSender sender;

    @Test
    public void contextLoads() {
        Order order = new Order();
        order.setId(2018092101);
        order.setName("测试订单1");
        order.setMessageId(System.currentTimeMillis()+"$"+ UUID.randomUUID().toString());
        sender.send(order);
        System.out.println("-----------消息发送成功--------");
    }

}

