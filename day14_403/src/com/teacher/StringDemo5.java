package com.yh.api;

/**
 * 分割-替换-去空格-正则的功能方法
 * - public String[] split(String regex)：将此字符串按照给定的regex（规则）拆分为字符串数组。
 * - public String trim()：去除该字符串的两端空格
 */
public class StringDemo5 {
    public static void main(String[] args) {
        //String s = "张三 李四 小王 赵六";
        //String[] split = s.split(" ");// 空格分割字符串

        String s = "张三|李四|小王|赵六";
        String[] split = s.split("\\|");// |分割字符串
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String s1 = " ab cd 123 ";
        System.out.println(s1.length());
        System.out.println(s1.trim());
        System.out.println(s1.trim().length());
        //把字符串中的空格使用 #替换
        System.out.println(s1.replaceAll("\\s", "#"));


    }
}
