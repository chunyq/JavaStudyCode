package com.homework;

import java.util.Scanner;

/**
 * ClassName:ReserveString
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/3 17:31
 */
public class ReserveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("反转后的字符串是：" + reversed);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
