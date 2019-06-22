package com.bj.controller;

import com.bj.entity.Member;
import com.bj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MemberController {

   /* //注入service层对象属性
    @Autowired
    private MemberService memberService;
    //根据id来查找联系人信息
    public String  findById(String id, Model model){
        Member member = memberService.findById(id);
        model.addAttribute("member",member);
        return "";
    }*/
}
