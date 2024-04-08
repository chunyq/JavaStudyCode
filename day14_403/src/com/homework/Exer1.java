package com.homework;

/**
 * ClassName:Exer1
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/3 16:54
 */
public class Exer1 {
    public static void main(String[] args) {
        String input = "helloworld";
        char first = Character.toUpperCase(input.charAt(0));
        String restOfString = input.substring(1).toLowerCase();
        System.out.println(first + restOfString);
    }
}
