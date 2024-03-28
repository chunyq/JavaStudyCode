package com.homework;

/**
 * ClassName:AcountTest
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 18:54
 */
public class AcountTest {
    public static void main(String[] args) {
        //使用无参构造方法创建对象，为变量赋值，调用方法 测试所有功能
        Acount a1 = new Acount();
        a1.setName("张三");
        a1.setId(666);
        a1.setBalance(2000);
        a1.setPassword(123456);
        a1.getInfo();
        a1.deposit(500);
        a1.withdraw(2300);

        //使用有参构造方法创建对象，调用方法 测试所有功能
        Acount a2 = new Acount(666,123456,"张三",2000);
        System.out.println();
        a2.getInfo();
        a2.deposit(600);
        a2.withdraw(750);

    }
}
