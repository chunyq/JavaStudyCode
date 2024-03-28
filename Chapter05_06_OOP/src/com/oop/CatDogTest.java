package com.oop;

/**
 * ClassName:CatDogTest
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 19:56
 */
public class CatDogTest {
    public static void main(String[] args) {
        //创建每个类的对象并给属性赋值
        Cat cat = new Cat();
        cat.brand = "波斯猫";
        cat.color = "花色";
        Dog dog = new Dog();
        dog.brand = "藏獒";
        dog.color = "黑色";
        //调用成员方法
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
    }
}
