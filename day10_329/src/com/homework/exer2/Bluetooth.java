package com.homework.exer2;

/**
 * ClassName:Bluetooth
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/3/29 18:47
 */
/*
    ������󷽷��� void btFunction()
    ������ͨ������ void connecting()��Ҫ�����"��������WIFI"
 */
public abstract class Bluetooth {
    //���󷽷�
    public abstract void btFunction();
    //��ͨ����
    public void connecting(){
        System.out.println("��������WIFI");
    }
}
