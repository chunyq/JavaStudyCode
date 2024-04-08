package com.yh.static_;

/**
 * @Author yh
 * @create 10:15
 */
public class StaticDemo2 {

    int a = 1;
    static int b = 2;

    {
        System.out.println("非静态--代码块--1");
        System.out.println("非静态--代码块--1");
        System.out.println(a);
        System.out.println(b);
    }

    {
        System.out.println("非静态--代码块--2");
        System.out.println("非静态--代码块--2");
    }

    static {
        System.out.println("+++++++++++静态--代码块--1");
        System.out.println("+++++++++++静态--代码块--1");
        System.out.println(b);
    }

    static {
        System.out.println("+++++++++++静态--代码块--2");
        System.out.println("+++++++++++静态--代码块--2");
        System.out.println(b);
    }

    public StaticDemo2() {
        System.out.println("构造方法开始执行了。。。创建对象");
    }

    public static void main(String[] args) {
        //程序执行顺序：1.初始化静态变量 静态代码块  才执行main
        System.out.println("主方法开始执行了。。。");
        System.out.println(StaticDemo2.b);
        System.out.println("=======");
        /*
         * 创建对象的流程：
         *   1.声明实例变量
         *   2.非静态代码块
         *   3.执行构造方法
         *
         * 每次创建对象都会执行以上流程
         *
         *  非静态代码块：为创建对象做初始化工作（每次创建对象都会执行）
         *  静态代码块：为类的运行做初始化工作（在类初始时只执行一次）
         * */
        StaticDemo2 demo2 = new StaticDemo2();
        System.out.println("=====");
        StaticDemo2 demo3 = new StaticDemo2();

    }
}
