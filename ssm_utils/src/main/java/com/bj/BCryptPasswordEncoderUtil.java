package com.bj;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//处理某些字段加密的工具类
public  class  BCryptPasswordEncoderUtil {
    private static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();

    public static String encodePassword(String str) {
         return bCryptPasswordEncoder.encode(str);
    }

    public static void main(String[] args) {
        String str="111";
        String s = encodePassword(str);
        System.out.println("加密之后的结果是："+s+"---->长度是"+s.length());
    }
}
