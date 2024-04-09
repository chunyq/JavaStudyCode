package com.homework.exer2;

/**
 * ClassName:StringDemo
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/4/8 18:45
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = " ahfkjahdfkjhakjhfdkjhajfdshkjahsf ";

        //长度
        System.out.println("字符串长度：" + s.length());
        //从前往后遍历
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();
        //从后往前遍历
        for (int i = s.length() - 1; i > 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();
        //找出第一个a出现的位置
        int firstAIndex = s.indexOf('a');
        System.out.println("第一个a出现的位置: " + firstAIndex);

        //找出最后一个a出现的位置
        int lastAIndex = s.lastIndexOf('a');
        System.out.println("最后一个a出现的位置: " + lastAIndex);

        //实现字符串两端去除空格字符
        String trimmedStr = s.trim();
        System.out.println("去除空格后的字符串: " + trimmedStr);

    }
}
