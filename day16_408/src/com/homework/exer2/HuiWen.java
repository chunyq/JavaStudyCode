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
        System.out.print("请输入一个字符串：");
        String s = sc.nextLine();
        if (isHuiWen(s)) {
            System.out.println("该字符串是回文串");
        } else {
            System.out.println("该字符串不是回文串");
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
