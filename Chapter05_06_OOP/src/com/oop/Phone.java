package com.oop;

/**
 * ClassName:Phone
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 19:37
 */
/*
�ֻ���Phone
    ����:
    Ʒ��brand
    �۸�price
    ��Ϊ:
    ��绰call()
    ������sendMessage()
    ����ϷplayGame(String name)
 */
public class Phone {
    //��Ա���� ����
    String brand;
    int price;

    //��Ա���� ��Ϊ
    //��绰
    public void call(){
        System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ���ֻ���绰.....");
    }
    public void sendMessage(){
        System.out.println("����ʹ��"+brand+"Ʒ�Ƶ��ֻ�������....");
    }
    public void playGame(String name){
        System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ���"+name+"��Ϸ....");
    }
}
