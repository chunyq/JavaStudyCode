package com.yunhe01_interface.exer1;

/**
 * ClassName:USB
 * Package:com.yunhe01_interface.exer1
 *
 * @Author 86183
 * @Create 2024/3/29 15:26
 */
//USB调用
public interface USB {
    //声明常量
    //public static final是默认修饰符
    public static final int l = 20;
    int k = 10;
    int h = 30;

    //方法
    //默认为抽象方法，没有方法体
    public abstract void start();

    void stop();


}
