package com.bj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
@Controller
public class ProductController {
    //添加的方法
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
    //删除的方法
    @RequestMapping("/delete")
    public String detele(){
        return "delele";
    }
    //修改的方法
    @RequestMapping("/update")
    public String update(){
        return "update";
    }
    //查找的方法
    @RequestMapping("/find")
    public String find(){
        return "find";
    }
    //主界面的方法
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
