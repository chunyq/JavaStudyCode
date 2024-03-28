package com.oop;

/**
 * ClassName:Phone
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 19:37
 */
/*
手机类Phone
    属性:
    品牌brand
    价格price
    行为:
    打电话call()
    发短信sendMessage()
    玩游戏playGame(String name)
 */
public class Phone {
    //成员变量 属性
    String brand;
    int price;

    //成员方法 行为
    //打电话
    public void call(){
        System.out.println("正在使用价格为"+price+"元的手机打电话.....");
    }
    public void sendMessage(){
        System.out.println("正在使用"+brand+"品牌的手机发短信....");
    }
    public void playGame(String name){
        System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机玩"+name+"游戏....");
    }
}
