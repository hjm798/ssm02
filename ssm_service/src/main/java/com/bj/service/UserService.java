package com.bj.service;

import com.bj.entity.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    //查找所有用户信息
    public List<UserInfo> findAll();

    //添加用户
    void save(UserInfo userInfo);

    //查询用户详情信息
    UserInfo findUserById(String id);
}
