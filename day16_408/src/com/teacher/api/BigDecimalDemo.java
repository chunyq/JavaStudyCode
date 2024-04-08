package com.teacher.api;

import java.math.BigDecimal;

/**
 * BigDecimal 处理浮点类型精确度丢失的问题 ，实现浮点数据的高精度运算
 * <p>
 * 1.概述：double和float类型在运算中很容易丢失精度,造成数据的不准确性,Java提供我们BigDecimal类可以实现浮点数据的高精度运算。
 * <p>
 * 2.BigDecimal类的构造方法
 * 方法名                          	说明
 * public BigDecimal(String val)	将String类型的数组封装为BigDecimal对象
 * ==建议浮点数据以字符串形式给出,因为参数结果是可以预知的==
 * <p>
 * 3.BigDecimal类的常用方法
 * 方法名                                     	说明
 * public BigDecimal add(BigDecimal augend)	浮点类型数据相加操作
 * public BigDecimal subtract(BigDecimal subtrahend)	浮点类型数据相减操作
 * public BigDecimal multiply(BigDecimal multiplicand)	浮点类型数据相乘操作
 * public BigDecimal divide(BigDecimal divisor)	浮点类型数据相除操作
 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode)
 * 浮点类型数据相除操作，按照指定的模式，保留几位小数
 * 参数一：表示参与运算的另外一个对象
 * 参数二：表示小数点后精确多少位
 * 参数三：舍入模式
 * BigDecimal.ROUND_UP： 进一法
 * BigDecimal.ROUND_FLOOR：去尾法
 * BigDecimal.ROUND_HALF_UP 四舍五入
 * 注意：
 * ROUND_HALF_UP：保留小数位后一位如果满足5，就进一
 * ROUND_FLOOR：保留小数位后一位不管满足5还是不满足5直接舍去掉
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        //精度丢失问题
        System.out.println(0.09 + 0.01);// 0.1 ???
        System.out.println(1.0 - 0.32);//0.68 ???
        System.out.println(1.015 * 100);//101.5 ???
        System.out.println(1.301 / 100);//0.01301 ???

        //BigDecimal x = new BigDecimal("0.09");
        //BigDecimal y = new BigDecimal("0.01");

        BigDecimal x = new BigDecimal("0.1");
        BigDecimal y = new BigDecimal("0.03");

        System.out.println(x.add(y));
        System.out.println(x.subtract(y));
        System.out.println(x.multiply(y));
        //System.out.println( x.divide(y));//除尽时用，除不尽时需要对小数位指定
        System.out.println(x.divide(y, 2, BigDecimal.ROUND_UP));//进一法
        System.out.println(x.divide(y, 2, BigDecimal.ROUND_FLOOR));//去尾法
        System.out.println(x.divide(y, 2, BigDecimal.ROUND_HALF_UP));//四舍五入


    }
}
