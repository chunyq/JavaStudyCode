package com.homework.exer1;

/**
 * ClassName:Phone
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/3/29 18:35
 */
/*  抽象类Phone
    普通方法: call() 输出:"打电话"
    普通方法: sendMessage() 输出:"发短信"
    抽象方法: playGame();
 */
public abstract class Phone {
    //抽象方法
    public abstract void playGame();

    //普通方法
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }
}
