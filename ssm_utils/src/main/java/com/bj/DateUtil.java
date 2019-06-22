package com.bj;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换工具类
 */
public class DateUtil {
    //将字符串转成指定形式的日期
    public static Date string2Date(String string ,String pattern) throws ParseException {
        //创建日期转换对象，传入日期样式
        DateFormat df=new SimpleDateFormat(pattern);
        //将传入的字符串转成对应格式的日期
        Date date = df.parse(string);
        return date;
    }

    //将日期转成字符串
    public static String date2String(Date date,String pattern){
        DateFormat df=new SimpleDateFormat(pattern);
        String str = df.format(date);
        return str;
    }

}
