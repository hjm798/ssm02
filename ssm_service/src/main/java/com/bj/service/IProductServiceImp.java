package com.bj.service;

import com.bj.dao.IProductDao;
import com.bj.entity.Product;
import com.bj.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class IProductServiceImp implements IProductService {

    //创建dao层对象
    @Autowired
    private IProductDao iProductDao;
    @Override
    public List<Product> findAll() {
        //调用dao层查询所有产品的方法
        System.out.println("这是service层");
        return iProductDao.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        //调用dao层
        iProductDao.saveProduct(product);
    }

    @Override
    public Product findById(String id) {
        return iProductDao.findById(id);
    }
}
