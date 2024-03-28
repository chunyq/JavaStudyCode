package com.oop;

/**
 * ClassName:PhoneTest
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 19:38
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建Phone类的对象并给属性赋值
        Phone phone = new Phone();
        phone.brand = "小米";
        phone.price = 998;
        //调用三个成员方法
        String name = "原神";
        phone.playGame(name);
        phone.call();
        phone.sendMessage();
    }
}
