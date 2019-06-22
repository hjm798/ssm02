package com.bj.service;

import com.bj.dao.RoleDao;
import com.bj.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImp implements RoleService {
    //注入dao层对象属性
    @Autowired
    private RoleDao roleDao;


    //查询所有的角色
    @Override
    public List<Role> findAll() {
        //调用dao层
        return roleDao.findAll();
    }

    //添加角色
    @Override
    public void save(Role role) {
        //调用dao层
        roleDao.save(role);
    }
}
