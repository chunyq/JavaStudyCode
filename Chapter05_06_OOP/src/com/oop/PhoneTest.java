package com.oop;

/**
 * ClassName:PhoneTest
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 19:38
 */
public class PhoneTest {
    public static void main(String[] args) {
        //����Phone��Ķ��󲢸����Ը�ֵ
        Phone phone = new Phone();
        phone.brand = "С��";
        phone.price = 998;
        //����������Ա����
        String name = "ԭ��";
        phone.playGame(name);
        phone.call();
        phone.sendMessage();
    }
}
