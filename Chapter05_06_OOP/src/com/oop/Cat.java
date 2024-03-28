package com.oop;

/**
 * ClassName:Cat
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 15:37
 */
/*
猫类Cat
    属性:
    毛的颜色color
    品种brand
    行为:
    吃饭eat()
    抓老鼠catchMouse()
 */
public class Cat {
    //成员变量/属性
    String brand;
    String color;

    //成员方法(行为)
    public void eat(){
        System.out.println(color+"的"+brand+"正在吃鱼....");
    }
    public void catchMouse(){
        System.out.println(color+"的"+brand+"正在逮老鼠....");
    }

}
