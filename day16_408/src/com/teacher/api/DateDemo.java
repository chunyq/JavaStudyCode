package com.yh.api;

import java.util.Date;

/**
 * 1.Date类概述
 * java.util.Date类 表示特定的瞬间，精确到毫秒。
 * <p>
 * 2.Date类的构造方法
 * 方法名                   	说明
 * public Date()         	分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）
 * public Date(long date)	分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”
 * 即1970年1月1日00:00:00 GMT）以来的指定毫秒数。
 * 由于我们处于东八区，所以我们的基准时间为1970年1月1日8时0分0秒。
 * <p>
 * 3.常用方法
 * Date类中的多数方法已经过时，常用的方法有
 * 方法名                  	说明
 * public long getTime()	把日期对象转换成对应的时间毫秒值
 * 4.过时的方法：
 * d.setYear(125);
 * d.setDate(7);
 * <p>
 * d.getYear()+1900;//年份基于1900
 * d.getMonth() +1;//月份：0-11
 * d.getDate() ;
 * d.getHours() ;
 * d.getMinutes();
 * d.getSeconds();
 * d.getDay();//0-6  0:星期日
 */
public class DateDemo {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);//当前日期对象

        //世界基准时间：格林威治时间： 1970-1-1 00:00:00
        //北京基准时间： 1970-1-1 08:00:00
        Date d2 = new Date(60000);
        System.out.println(d2);
        System.out.println(d2.toString());

        //相对基准时间得到的毫秒数
        long time = d.getTime();
        long time1 = d2.getTime();

        System.out.println(time1);
        System.out.println(time);
        System.out.println("====过期的方法=====");

        d.setYear(125);
        d.setDate(7);

        System.out.println(d.getYear() + 1900);//年份基于1900
        System.out.println(d.getMonth() + 1);//月份：0-11
        System.out.println(d.getDate());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getDay());//0-6  0:星期日

    }
}
