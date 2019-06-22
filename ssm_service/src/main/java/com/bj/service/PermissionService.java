package com.bj.service;

import com.bj.entity.Permission;

import java.util.List;

public interface PermissionService {
    //查询所有的权限信息
     List<Permission> findAll();

     //添加权限
    void save(Permission permission);
}
