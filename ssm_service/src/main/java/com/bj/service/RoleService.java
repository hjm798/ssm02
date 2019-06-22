package com.bj.service;

import com.bj.entity.Role;

import java.util.List;

public interface RoleService {
    //查询所有的角色
    List<Role> findAll();

    //添加角色
    void save(Role role);
}
