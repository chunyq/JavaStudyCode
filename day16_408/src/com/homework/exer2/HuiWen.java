package com.homework.exer2;

import java.util.Scanner;

/**
 * ClassName:HuiWen
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/4/8 19:18
 */
public class HuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������һ���ַ�����");
        String s = sc.nextLine();
        if (isHuiWen(s)) {
            System.out.println("���ַ����ǻ��Ĵ�");
        } else {
            System.out.println("���ַ������ǻ��Ĵ�");
        }
        sc.close();

    }

    public static boolean isHuiWen(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
