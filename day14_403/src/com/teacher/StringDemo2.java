package com.yh.api;

/**
 * String类的判断功能：
 * boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
 * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
 * boolean contains(String str):判断大字符串中是否包含小字符串
 * boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
 * boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
 * boolean isEmpty():判断字符串是否为空。
 * 注意：
 * 字符串内容为空和字符串对象为空。
 * String s = "";内容为空
 * String s = null; 字符串对象为空
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc123");
        String s2 = new String("aBC123");

        boolean b = s1.equals(s2);//区分大小写
        System.out.println(b);
        boolean b1 = s1.equalsIgnoreCase(s2);//不区分
        System.out.println(b1);

        System.out.println(s1.contains("bc1"));//包含
        System.out.println(s1.startsWith("ab"));
        System.out.println(s1.endsWith(".txt"));//可用来判断文件的类型
        System.out.println(s1.isEmpty());
        System.out.println("".isEmpty());//true
        System.out.println(" ".isEmpty());//false
    }
}
