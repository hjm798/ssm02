package com.bj.service;

import com.bj.dao.OrderDao;
import com.bj.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrderServiceImp implements OrderService {

    //注入dao层属性
    @Autowired
    private OrderDao orderDao;

    //查询所有的订单
    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    //根据订单id值，查询订单的详情
    @Override
    public Order findById(String orderId) {
        return orderDao.findById(orderId);
    }


}
