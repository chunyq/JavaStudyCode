package com.homework;

/**
 * ClassName:AcountTest
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 18:54
 */
public class AcountTest {
    public static void main(String[] args) {
        //ʹ���޲ι��췽����������Ϊ������ֵ�����÷��� �������й���
        Acount a1 = new Acount();
        a1.setName("����");
        a1.setId(666);
        a1.setBalance(2000);
        a1.setPassword(123456);
        a1.getInfo();
        a1.deposit(500);
        a1.withdraw(2300);

        //ʹ���вι��췽���������󣬵��÷��� �������й���
        Acount a2 = new Acount(666,123456,"����",2000);
        System.out.println();
        a2.getInfo();
        a2.deposit(600);
        a2.withdraw(750);

    }
}
