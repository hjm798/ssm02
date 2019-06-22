package com.bj.service;

import com.bj.entity.Order;

import java.util.List;

public interface OrderService {

    //查询所有的订单信息
    public List<Order> findAll();

    //根据id查询订单的详情
    Order findById(String orderId);


}
