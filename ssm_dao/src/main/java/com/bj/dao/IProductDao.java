package com.bj.dao;

import com.bj.entity.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

import java.util.List;
@Repository
public interface IProductDao {

    //查询所有的产品信息
    @Select("select * from product")
    public List<Product> findAll();
    //添加商品的方法
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) " +
            "values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void saveProduct(Product product);

    //根据id值来查询某个产品
    @Select("select * from product where id=#{id}")
    Product findById(String id);
}
