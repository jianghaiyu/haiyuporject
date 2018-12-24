package com.haiyu.client.security;

import com.haiyu.client.dao.TestUserMapper;
import com.haiyu.client.entity.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl  implements UserDetailsService {
    @Autowired
    private TestUserMapper testUserMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TestUser user = testUserMapper.findByusername(username);
        return new JwtUser(user);
    }
}
