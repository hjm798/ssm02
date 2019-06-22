package com.bj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * 实现文件的一些功能，比如文件上传或者下载的功能
 */
@Controller
@RequestMapping("/file")
public class FileController {
    /*
    * MultipartFile：这个是springmvc提供获得文件上传名的一个对象，变量名必须是提交表单的name值一致
    * */
    @RequestMapping("/upload")
    public String fileUpload(MultipartFile upload, HttpServletRequest request) throws Exception {

        //1.先是获取到文件上传到服务器的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        //创建文件对象
        File file=new File(path);

        //判断是否存在此文件夹
        if(!file.exists()){
            //不存在则进行创建
            file.mkdirs();
        }
        //2.获取上传文件的名称
        String filename = upload.getOriginalFilename();
        //根据需求可以设置文件的唯一性

        //3.上传文件
        upload.transferTo(new File(file,filename));

        return "success";
    }
}
