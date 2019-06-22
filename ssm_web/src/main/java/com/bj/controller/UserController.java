package com.bj.controller;

import com.bj.entity.UserInfo;
import com.bj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    //查询所有用户
    @RequestMapping("findAll")
    public String findAll(Model model){
        //调用dao层
        List<UserInfo> list = userService.findAll();
        //将获取到的用户信息，封装到model对象中
        model.addAttribute("list",list);
        return "user-list";
    }

    //添加用户
    @RequestMapping("/save")
    public String save(UserInfo userInfo){
        //调用dao层
        userService.save(userInfo);
        //添加之后返回到成功页面
        return "success";
    }

    //查询用户详情信息
    @RequestMapping("/findById")
    public String findUserById(String id,Model model){
        //调用service层
        UserInfo userInfo=userService.findUserById(id);
        model.addAttribute("user",userInfo);
        return "user-show";
    }
}
