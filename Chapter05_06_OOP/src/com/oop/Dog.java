package com.oop;

/**
 * ClassName:Dog
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 19:53
 */
/*
����Dog
    ����:
    ë����ɫcolor
    Ʒ��brand
    ��Ϊ:
    �Է�()
    ����lookHome()
 */
public class Dog {
    //��Ա����
    String brand;
    String color;

    //��Ա����
    public void eat(){
        System.out.println(color+"��"+brand+"���ڳԷ�....");
    }
    public void lookHome(){
        System.out.println(color+"��"+brand+"���ڿ���....");
    }
}
