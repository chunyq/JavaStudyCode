package com.homework.exer1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ClassName:IdCardCalculate
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/13 17:47
 */
public class IdCardCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������֤�ţ�");
        String idCard = sc.nextLine();

        //������֤�ŵĺϷ���
        if (idCard.length() != 18) {
            System.out.println("���֤�ų��Ȳ���ȷ��������18λ���֤�š�");
            return;
        }

        //��ȡ��������
        String birthDateString = idCard.substring(6, 14);
        int year = Integer.parseInt(birthDateString.substring(0, 4));
        int month = Integer.parseInt(birthDateString.substring(4, 6)) - 1; // �·���Ҫ��1����ΪCalendar�Ǵ�0��ʼ������
        int day = Integer.parseInt(birthDateString.substring(6, 8));

        // �����������ڶ���
        Calendar birthCalendar = new GregorianCalendar(year, month, day);
        Date birthDate = birthCalendar.getTime();

        // ָ����ǰ���ڣ�����ʽ��Ϊ"��-��-��"
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy��MM��dd��");
        Date currentDate = new Date(); // Ĭ���ǵ�ǰ���ں�ʱ��
        String formattedCurrentDate = formatter.format(currentDate);
        System.out.println("��ǰ����Ϊ: " + formattedCurrentDate);

        // ������������֮�������
        long diffInMillis = currentDate.getTime() - birthDate.getTime();
        long daysBetween = diffInMillis / (1000 * 60 * 60 * 24);

        // ������
        System.out.println("������������������Ϊ: " + daysBetween + "��");

    }
}
