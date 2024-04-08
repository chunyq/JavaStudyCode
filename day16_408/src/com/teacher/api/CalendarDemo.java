package com.yh.api;

import java.util.Calendar;
import java.util.Date;

/**
 * 1.Calendar类概述
 * java.util.Calendar是日历类，在Date后出现，替换掉了许多Date的方法。
 * 该类将所有可能用到的时间信息封装为静态成员变量，方便获取。日历类就是方便获取各个时间属性的。
 * 2.Calendar类获取方式
 * Calendar为抽象类，由于语言敏感性，Calendar类在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象
 * 方法名                                 	说明
 * public static Calendar getInstance()	使用默认时区和语言环境获得一个日历
 * 3.常用方法
 * 方法名                                     	说明
 * public int get(int field)               	返回给定日历字段的值。
 * public void set(int field, int value)   	将给定的日历字段设置为给定值。
 * public abstract void add(int field, int amount)	根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * public Date getTime()                   	返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
 * <p>
 * ==Calendar类中提供很多成员常量，代表给定的日历字段：==
 * 字段值         	含义
 * YEAR        	年
 * MONTH       	月（从0开始，可以+1使用）
 * DAY_OF_MONTH	月中的天（几号）
 * HOUR        	时（12小时制）
 * HOUR_OF_DAY 	时（24小时制）
 * MINUTE      	分
 * SECOND      	秒
 * DAY_OF_WEEK 	周中的天（周几，周日为1，可以-1使用）
 * 注意：
 * 西方星期的开始为周日，中国为周一。
 * 在Calendar类中，月份的表示是以0-11代表1-12月。
 * 日期是有大小关系的，时间靠后，时间越大。
 * 4.Calendar和 Date互转
 * Date:c.getTime()
 * c.setTime(Date d)
 * 5.Date和Calendar区别：
 * 区别：
 * 比较明显的区别是Date是日期，Calendar是日历，
 * Date是类，Calendar是抽象类。
 * 当然，你也可以觉得Calendar是Date的加强版，今后如何使用呢？ 都会使用，Calendar功能更强大
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //getCalendar();
        //getMethod1();
        dateCalenderCast();
    }

    public static void dateCalenderCast() {//日期和日历的转换
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();//获取日期对象
        System.out.println(d);

        //把日期数据设置给日历
        c.setTime(new Date());
    }

    public static void getMethod1() { //常用方法测试
        Calendar c = Calendar.getInstance();
        c.set(2024, 3, 7, 15, 20, 67);
        //设置  指定字段  值
        c.set(Calendar.YEAR, 2025);
        c.set(Calendar.MONTH, 9);

        c.add(Calendar.MONTH, 2);//月份 +2 月
        c.add(Calendar.DATE, -6);//日期 -6 天

        System.out.println(c.get(Calendar.YEAR)); //获取指定字段的值
        System.out.println(c.get(1));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MILLISECOND));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));// 1-7  1:周日
    }

    public static void getCalendar() {
        //抽象类不能直接创建对象。通过静态方法获取子类对象(向上转型)
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.toString());

    }

  /*  public Animal test01(){
    //    Animal  Cat  Dog
        return new Cat();
    }*/
}
