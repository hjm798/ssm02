package com.bj.controller;

import com.bj.entity.Role;
import com.bj.service.RoleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    //创建service层对象属性
    @Autowired
    private RoleServiceImp roleServiceImp;
    //查询所有角色的方法
    @RequestMapping("/findAll")
    public String findAll(Model model){
        //调用service层的方法
        List<Role> list = roleServiceImp.findAll();
        //将获得到的数据进行封装到model中去
        model.addAttribute("list",list);
        return "role-list";
    }

    //添加角色的方法
    @RequestMapping("/save")
    public String save(Role role){
        //调用service层的方法实现添加
        roleServiceImp.save(role);
        return "success";
    }
}
