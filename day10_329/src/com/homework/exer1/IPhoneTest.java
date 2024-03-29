package com.homework.exer1;

/**
 * ClassName:IPhoneTest
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/3/29 18:35
 */
/*
定义测试类IPhoneTest, 创建IPhone的对象,调用方法,打印出如下语句
    打电话
    发彩信
    打王者农药
    人工智障
 */
public class IPhoneTest {
    public static void main(String[] args) {
        IPhone phone = new IPhone();
        phone.call();
        //子类重写方法覆盖父类的方法
        phone.sendMessage();
        phone.playGame();
        //子类特有方法
        phone.siri();
    }
}
