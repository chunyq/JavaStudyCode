package com.yh.api;

/**
 * String 转换的方法：
 * - public char[] toCharArray()：将此字符串转换为新的字符数组。
 * - public byte[] getBytes()：使用平台的默认字符集将该String编码转换为新的字节数组。
 * - public String replace(char oldChar, char newChar)：将oldChar匹配的字符串使用newChar字符串替换。
 * - public String replaceFirst(String regex,String replacement)用给定的 replacement 替换此字符串匹配给定的regex的第一个子字符串。
 * - public String toUpperCase() :  将字符中转换为大写
 * - public String toLowerCase():  将字符中转换为小写
 * <p>
 * 分割-替换-去空格-正则的功能方法
 * - public String[] split(String regex)：将此字符串按照给定的regex（规则）拆分为字符串数组。
 * - public String trim()：去除该字符串的两端空格
 */
public class StringDemo4 {
    public static void main(String[] args) {

        String s = new String("abBcdAa012a3");
        char[] chars = s.toCharArray();
        //for (int i = 0; i < chars.length; i++) {
        //    System.out.println(chars[i]);
        //}
        byte[] bytes = s.getBytes();
        //for (int i = 0; i < bytes.length; i++) {
        //    System.out.println(bytes[i]);
        //}

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);

        System.out.println(s.replace('a', '*'));
        System.out.println(s.replace("a", "***"));
        System.out.println(s.replaceFirst("a", "##"));
    }
}
