package com.homework;

/**
 * ClassName:ProduceTest
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:30
 */
/*
1.��������Ҫ����Manager���Coder��,���ɿղΡ��вι���
2.���������,��main�����д���ÿ����Ķ��󲢸����Ը�ֵ
3.����ÿ������ĳ�Ա����,��ӡ��ʽ����:
����Ϊ123��������Ϊ15000����Ϊ6000����Ŀ�����ܰ�Ƥ����Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....
����Ϊ135��������Ϊ10000�ĳ���Ա���������Ŭ����д�Ŵ���......
 */
public class ProduceTest {
    public static void main(String[] args) {
        //�������󲢳�ʼ������
        Manager manager = new Manager("�ܰ�Ƥ","123",15000,6000);
        Coder coder = new Coder("�����","135",10000);

        manager.work();
        coder.work();

    }
}
