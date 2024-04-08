package com.teacher;

/**
 * 字符串中获取的功能：
 * - public int length() ：返回此字符串的长度
 * - public String concat(String str): 将指定的字符串连接到该字符串的末尾。
 * - public char charAt(int index): 返回指定索引处的char值。
 * - public int indexOf(int ch)：返回指定子字符串第一次出现在该字符串内的索引。
 * - public String substring(int beginIndex)：返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
 * - public String substring(int beginIndex,int endIndex)：返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String s = new String("abxx abc Hjkah");//""中的空格也是有效字符数据
        System.out.println(s.length());

        System.out.println(s.concat("abc123"));//返回新的字符串数据
        System.out.println(s);//字符串本身的值不改变

        char c = s.charAt(3);// 0  length()-1
        //c = s.charAt(-1);
        //c = s.charAt(14);//StringIndexOutOfBoundsException:字符串索引越界异常
        System.out.println(c);

        int a = s.indexOf('a');
        System.out.println(a);
        System.out.println(s.indexOf("bx"));
        System.out.println(s.indexOf("bxyz"));// 找不到：返回-1
        System.out.println(s.indexOf("a", 3));//从所以3开始获取a第一次出现的位置

        System.out.println(s.lastIndexOf("a"));//最后一次出现的位置

        String substring = s.substring(2);//从2开始截取到最后
        System.out.println(substring);

        System.out.println(s.substring(2, 12));//从2开始截取到12的前一位

        System.out.println(s);//字符串本身的值不改变


    }
}
