package com.oop;

/**
 * ClassName:Dog
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 19:53
 */
/*
狗类Dog
    属性:
    毛的颜色color
    品种brand
    行为:
    吃饭()
    看家lookHome()
 */
public class Dog {
    //成员变量
    String brand;
    String color;

    //成员方法
    public void eat(){
        System.out.println(color+"的"+brand+"正在吃饭....");
    }
    public void lookHome(){
        System.out.println(color+"的"+brand+"正在看家....");
    }
}
