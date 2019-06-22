package com.bj.controller;

import com.bj.entity.Order;
import com.bj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //查询所有的订单信息
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Order> list = orderService.findAll();
        model.addAttribute("list",list);
        return "orders-list";
    }
    //查询订单详情
    @RequestMapping("/findById")
    public ModelAndView findById(String orderId, Model model) throws IOException, ServletException {
            //调用service层
        Order orders = orderService.findById(orderId);
        ModelAndView mv=new ModelAndView();
        System.out.println(orderId);
        mv.addObject("orders",orders);
        mv.setViewName("orders-show");
        return mv;
    }
}
