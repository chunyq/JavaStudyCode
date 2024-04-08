package com.homework;

import java.util.Scanner;

/**
 * ClassName:Exer2
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/3 16:59
 */
public class Exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������һ���ַ�����");
        String input = sc.nextLine();

        int upperCaseCount = 0; //��д��ĸ����
        int lowerCaseCount = 0; //Сд��ĸ����
        int digitCount = 0; //���ָ���

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }

        }
        System.out.println("��д��ĸ������" + upperCaseCount);
        System.out.println("Сд��ĸ������" + lowerCaseCount);
        System.out.println("�����ַ�������" + digitCount);

    }
}
