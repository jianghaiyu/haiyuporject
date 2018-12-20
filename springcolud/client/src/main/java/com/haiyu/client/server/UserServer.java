package com.haiyu.client.server;

import com.haiyu.client.dao.UserMapper;
import com.haiyu.client.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServer {
    @Autowired
    private UserMapper userMapper;

    public User findUserByid(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
