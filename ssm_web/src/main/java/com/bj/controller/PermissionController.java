package com.bj.controller;

import com.bj.entity.Permission;
import com.bj.entity.Role;
import com.bj.service.PermissionService;
import com.bj.service.PermissionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/permission")
public class PermissionController {

    //注入service层对象属性
    @Autowired
    private PermissionServiceImp permissionServiceImp;
    //查询所有的权限信息
    @RequestMapping("/findAll")
    public String findAll(Model model){
        //调用service层的方法
        List<Permission> list = permissionServiceImp.findAll();
        //将获得到的数据进行封装到model中去
        model.addAttribute("list",list);
        return "permission-list";
    }
    //权限的添加方法
    @RequestMapping("save")
    public String save(Permission permission){
        //调用service层的方法
        permissionServiceImp.save(permission);
        return "success";
    }

}
