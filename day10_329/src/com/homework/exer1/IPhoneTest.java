package com.homework.exer1;

/**
 * ClassName:IPhoneTest
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/3/29 18:35
 */
/*
���������IPhoneTest, ����IPhone�Ķ���,���÷���,��ӡ���������
    ��绰
    ������
    ������ũҩ
    �˹�����
 */
public class IPhoneTest {
    public static void main(String[] args) {
        IPhone phone = new IPhone();
        phone.call();
        //������д�������Ǹ���ķ���
        phone.sendMessage();
        phone.playGame();
        //�������з���
        phone.siri();
    }
}
