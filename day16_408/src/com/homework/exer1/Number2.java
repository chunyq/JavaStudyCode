package com.homework.exer1;

import java.util.Calendar;

/**
 * ClassName:Number2
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/8 18:40
 */
public class Number2 {
    public static void main(String[] args) {
        //��ȡ��������
        Calendar calendar = Calendar.getInstance();

        // ��ȡ���
        int year = calendar.get(Calendar.YEAR);
        // ��ȡ�·ݣ�ע�⣺�·��Ǵ�0��ʼ�ģ�����ʵ���·���Ҫ+1��
        int month = calendar.get(Calendar.MONTH) + 1;
        // ��ȡ����
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // �����ݡ��·ݺ�����
        System.out.println("���: " + year);
        System.out.println("�·�: " + month);
        System.out.println("����: " + day);
    }
}
