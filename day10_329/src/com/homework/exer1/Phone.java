package com.homework.exer1;

/**
 * ClassName:Phone
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/3/29 18:35
 */
/*  ������Phone
    ��ͨ����: call() ���:"��绰"
    ��ͨ����: sendMessage() ���:"������"
    ���󷽷�: playGame();
 */
public abstract class Phone {
    //���󷽷�
    public abstract void playGame();

    //��ͨ����
    public void call() {
        System.out.println("��绰");
    }

    public void sendMessage() {
        System.out.println("������");
    }
}
