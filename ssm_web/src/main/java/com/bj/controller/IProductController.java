package com.bj.controller;

import com.bj.entity.Product;
import com.bj.service.IProductService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@Controller
@RequestMapping("/product")
public class IProductController {
    //创建service层的对象
    @Autowired
    private IProductService iProductService;

    //查询所有的产品信息
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        //调用service层
        List<Product> list = iProductService.findAll();
        //将数据封装到model中
        model.addAttribute("list",list);
        //返回到页面
        return "product-list";

    }

    //添加商品的操作
    @RequestMapping("/save")
    public void addProduct(Product product, HttpServletResponse response) throws IOException {
        //调用service层的方法
        iProductService.saveProduct(product);

        //重定向到列表页面
        response.sendRedirect("/ssm/product/findAll");
//       return "product-list";   如果是下面这样进行跳转，那就是相当于直接访问product-liat.jsp页面，是不会携带任何数据的
    }

    //查询某个商品
    public void findById(Model model,String id,HttpServletResponse response) throws IOException {
        //调用service层
        Product product=iProductService.findById(id);
        model.addAttribute(product);
        response.sendRedirect("/ssm/product/findAll");
    }
}
