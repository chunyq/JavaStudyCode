package com.homework.exer1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ClassName:IdCardCalculate
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/13 17:47
 */
public class IdCardCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String idCard = sc.nextLine();

        //检查身份证号的合法性
        if (idCard.length() != 18) {
            System.out.println("身份证号长度不正确，请输入18位身份证号。");
            return;
        }

        //截取生日日期
        String birthDateString = idCard.substring(6, 14);
        int year = Integer.parseInt(birthDateString.substring(0, 4));
        int month = Integer.parseInt(birthDateString.substring(4, 6)) - 1; // 月份需要减1，因为Calendar是从0开始计数的
        int day = Integer.parseInt(birthDateString.substring(6, 8));

        // 创建出生日期对象
        Calendar birthCalendar = new GregorianCalendar(year, month, day);
        Date birthDate = birthCalendar.getTime();

        // 指定当前日期，并格式化为"年-月-日"
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日");
        Date currentDate = new Date(); // 默认是当前日期和时间
        String formattedCurrentDate = formatter.format(currentDate);
        System.out.println("当前日期为: " + formattedCurrentDate);

        // 计算两个日期之间的天数
        long diffInMillis = currentDate.getTime() - birthDate.getTime();
        long daysBetween = diffInMillis / (1000 * 60 * 60 * 24);

        // 输出结果
        System.out.println("你来到这个世界的天数为: " + daysBetween + "天");

    }
}
