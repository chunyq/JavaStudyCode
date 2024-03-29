package com.homework.exer2;

/**
 * ClassName:Bluetooth
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/3/29 18:47
 */
/*
    定义抽象方法： void btFunction()
    定义普通方法： void connecting()，要求：输出"可以连接WIFI"
 */
public abstract class Bluetooth {
    //抽象方法
    public abstract void btFunction();
    //普通方法
    public void connecting(){
        System.out.println("可以连接WIFI");
    }
}
