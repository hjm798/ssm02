package com.bj.dao;

import com.bj.entity.Traveller;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


import java.util.List;
@Repository
public interface TravellerDao {
    //查询游客信息
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{orderId})")
    public List<Traveller> findByOrdersId(String orderId) throws Exception;
}
