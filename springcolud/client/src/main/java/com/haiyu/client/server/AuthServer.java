package com.haiyu.client.server;

import com.haiyu.client.dao.TestUserMapper;
import com.haiyu.client.entity.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServer {
    @Autowired
    private TestUserMapper testUserMapper;

    public TestUser save (TestUser user){
         testUserMapper.insertSelective(user);
         return user;
    }
}
