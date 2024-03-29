package com.homework.exer1;

/**
 * ClassName:IPhone
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/3/29 18:35
 */
/*
    重写sendMessage()方法,输出:"发彩信"
    实现playGame()方法,输出:"打王者农药"
    定义自己特有的行为 :
    siri() 打印"人工智障"
 */
public class IPhone extends Phone {
    //重写抽象类Phone的方法

    @Override
    public void sendMessage() {
        System.out.println("发彩信");
    }

    @Override
    public void playGame() {
        System.out.println("打王者农药");
    }

    //定义特有的行为
    public void siri() {
        System.out.println("人工智障");
    }
}
