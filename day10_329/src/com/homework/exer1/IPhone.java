package com.homework.exer1;

/**
 * ClassName:IPhone
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/3/29 18:35
 */
/*
    ��дsendMessage()����,���:"������"
    ʵ��playGame()����,���:"������ũҩ"
    �����Լ����е���Ϊ :
    siri() ��ӡ"�˹�����"
 */
public class IPhone extends Phone {
    //��д������Phone�ķ���

    @Override
    public void sendMessage() {
        System.out.println("������");
    }

    @Override
    public void playGame() {
        System.out.println("������ũҩ");
    }

    //�������е���Ϊ
    public void siri() {
        System.out.println("�˹�����");
    }
}
