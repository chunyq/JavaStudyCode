package com.teacher;

/**
 * 1.Math类概述
 * <p>
 * `java.lang.Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。类似这样的工具类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单。
 * <p>
 * 2.Math类常用方法
 * <p>
 * 方法名                                     	说明
 * Math.PI                                 	常量，圆周率
 * public static double abs(double num)    	取绝对值
 * public static double ceil(double num)   	向上取整
 * public static double floor(double num)  	向下取整
 * public static long round(double num)    	四舍五入
 * public static int max(int a, int b)     	求最大值
 * public static int min(int a, int b)     	求最小值
 * public static double pow(double a, double b)	求a的b次幂
 * public static double random()           	随机数，随机的范围[0,1)
 */
public class MathDemo {
    public static void main(String[] args) {

        System.out.println(Math.PI);

        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));

        System.out.println(Math.abs(-5.2));

        System.out.println(Math.round(12.5));//13
        System.out.println(Math.round(-12.5));//-12
        System.out.println(Math.round(12.2));
        System.out.println(Math.round(12.6));

        System.out.println(Math.ceil(12.2));//向上取整  13.0
        System.out.println(Math.ceil(12.9));
        System.out.println(Math.ceil(12));

        System.out.println(Math.floor(12.2));//向下取整 12.0
        System.out.println(Math.floor(12.9));
        System.out.println(Math.floor(12));
        System.out.println("===");
        System.out.println(Math.max(12, 3));
        System.out.println(Math.max(12, 3.0)); //12.0

        System.out.println(Math.min(12, 2.0));//2.0

        System.out.println(Math.pow(2, 10));//幂次方
        System.out.println("=====");
        System.out.println(Math.random());//[0,1)
        System.out.println(Math.random() * 100);//[0,100)之间的小数

        System.out.println((int) (Math.random() * 100));//[0,100)之间的小数
        System.out.println("======");
        System.out.println(Math.round(Math.random() * 100));//[0,100]之间的小数
        System.out.println(Math.round(Math.random() * 100));//[0,100]之间的小数
        System.out.println(Math.round(Math.random() * 100));//[0,100]之间的小数
        System.out.println(Math.round(Math.random() * 100));//[0,100]之间的小数
        System.out.println(Math.round(Math.random() * 100));//[0,100]之间的小数
        System.out.println(Math.round(Math.random() * 100));//[0,100]之间的小数
        System.out.println("===50-120===");  //0-70  +50
        System.out.println(Math.round(Math.random() * 70 + 50));//[0,100]之间的小数
        System.out.println(Math.round(Math.random() * 70 + 50));//[0,100]之间的小数
        System.out.println(Math.round(Math.random() * 70 + 50));//[0,100]之间的小数
        System.out.println(Math.round(Math.random() * 70 + 50));//[0,100]之间的小数


    }
}
