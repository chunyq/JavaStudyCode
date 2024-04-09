package com.homework.exer1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:Number1
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/8 18:28
 */
/*
把当前日期对象格式化为 指定样式(2024年03月08日 16时40分20秒 )
 */
public class Number1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //格式化日期
        Date date = new Date();
        String strDate = sdf.format(date);
        System.out.println(strDate);
    }
}
