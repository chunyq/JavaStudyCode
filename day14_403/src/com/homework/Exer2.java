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
        System.out.print("请输入一个字符串：");
        String input = sc.nextLine();

        int upperCaseCount = 0; //大写字母个数
        int lowerCaseCount = 0; //小写字母个数
        int digitCount = 0; //数字个数

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
        System.out.println("大写字母个数：" + upperCaseCount);
        System.out.println("小写字母个数：" + lowerCaseCount);
        System.out.println("数字字符个数：" + digitCount);

    }
}
