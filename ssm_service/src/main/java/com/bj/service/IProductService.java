package com.bj.service;

import com.bj.entity.Product;

import java.util.List;

public interface IProductService {

    //查询所有的产品信息
    public List<Product> findAll();

    void saveProduct(Product product);

    //查询某个产品
    Product findById(String id);
}
