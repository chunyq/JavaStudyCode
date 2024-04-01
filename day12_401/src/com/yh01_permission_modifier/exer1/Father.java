package com.yh01_permission_modifier.exer1;

/**
 * ClassName:Father
 * Package:com.yunhe01_polymorphism.exer1
 *
 * @Author 86183
 * @Create 2024/4/1 15:38
 */
/*
同一个包下同一类中，可访问所有成员
不受权限修饰符限制
 */
public class Father {
    public int a;  //public 公共的 同包、不同包都可以访问
    int b;     //缺省的  只能在同一包中
    protected int c; //protected 受保护的  能在同一个包(子类或者无关类)、不同包的子类中访问
    private int d;  //private 私有的 只能在同一类中访问

    public void test1() {
        System.out.println("public 公共的 同包、不同包都可以访问");
    }

    void test2() {
        System.out.println("缺省的  只能在同一包中");
    }

    protected void test3() {
        System.out.println("protected 受保护的  能在同一个包(子类或者无关类)、不同包的子类中访问");
    }

    private void test4() {
        System.out.println("private 私有的 只能在同一类中访问");
    }


    //开始测试
    //同一类
    public static void main(String[] args) {
        Father father = new Father();
        father.a = 0;
        father.b = 0;
        father.c = 0;
        father.d = 0;
        father.test1();
        father.test2();
        father.test3();
        father.test4();
    }
}
