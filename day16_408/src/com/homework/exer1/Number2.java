package com.homework.exer1;

import java.util.Calendar;

/**
 * ClassName:Number2
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/8 18:40
 */
public class Number2 {
    public static void main(String[] args) {
        //获取日历对象
        Calendar calendar = Calendar.getInstance();

        // 获取年份
        int year = calendar.get(Calendar.YEAR);
        // 获取月份（注意：月份是从0开始的，所以实际月份需要+1）
        int month = calendar.get(Calendar.MONTH) + 1;
        // 获取日期
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // 输出年份、月份和日期
        System.out.println("年份: " + year);
        System.out.println("月份: " + month);
        System.out.println("日期: " + day);
    }
}
