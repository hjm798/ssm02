package com.bj.dao;

import com.bj.entity.Member;
import com.bj.entity.Order;
import com.bj.entity.Product;
import net.sf.jsqlparser.schema.Column;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDao {

    //查询所有的订单信息
    @Select("select * from orders")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.bj.dao.IProductDao.findById",fetchType = FetchType.EAGER)),
    })
            public List<Order> findAll();

    //根据id值查询订单的详情
    @Select("select * from orders where id=#{orderId}")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.bj.dao.IProductDao.findById",fetchType = FetchType.EAGER)),
            @Result(property = "member",column = "memberId",javaType = Member.class,one = @One(select = "com.bj.dao.MemberDao.findById",fetchType = FetchType.EAGER)),
            @Result(property = "travellers",column = "id",javaType =java.util.List.class,many = @Many(select = "com.bj.dao.TravellerDao.findByOrdersId"))
    })
    Order findById(String orderId);
}
