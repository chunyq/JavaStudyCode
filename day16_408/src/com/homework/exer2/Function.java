package com.homework.exer2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName:Function
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/4/8 20:40
 */
public class Function {
    public static void main(String[] args) throws ParseException {
        System.out.println("������������� ��ʽ YYYY-MM-dd");
        // ��ȡ��������,��������
        String birthdayString = new Scanner(System.in).next();
        // ���ַ�������,ת��Date����
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // ���÷���parse,�ַ���ת�����ڶ���
        Date birthdayDate = sdf.parse(birthdayString);
        // ��ȡ��������ڶ���
        Date todayDate = new Date();
        // ��������
        long birthdaySecond = birthdayDate.getTime();
        // ��������
        long todaySecond = todayDate.getTime();
        // ��������  - �������� = �õ�ʱ�����ֵ
        long secone = todaySecond - birthdaySecond;
        if (secone < 0) {
            System.out.println("��û������");
        } else {
            System.out.println("��������������Ѿ���" + secone / 1000 / 60 / 60 / 24 + "����");
        }
    }
}
