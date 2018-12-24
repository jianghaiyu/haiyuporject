package com.haiyu.client.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.haiyu.client.entity.TestUser;
@Mapper
public interface TestUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);

    TestUser findByusername(@Param("username")String username);
}