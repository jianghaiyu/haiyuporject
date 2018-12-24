package com.haiyu.client.controller;

import com.haiyu.client.entity.User;
import com.haiyu.client.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserServer userServer;

    @PostMapping("/finduserbyid")
    public User findUserByid(@RequestBody Map map){
         int id = (int)map.get("id");
        return userServer.findUserByid(id);
    }
}
