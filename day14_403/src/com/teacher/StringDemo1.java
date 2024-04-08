package com.teacher;

/**
 * 1、概述：
 * String类：字符串类，final class:是最终类,不能有子类
 * 字符串不变：字符串的值在创建后不能被更改
 * 重新赋值时：重新开辟内存，变量指向新内存
 * 因为String对象是不可变的，所以它们可以被共享
 * 注：字符串数据是保存到常量池中的，所以可以共享数据
 * <p>
 * 2.String的本质是
 * - JDK8之前是char[] 数组
 * - JDK8之后是byte[] 数组
 * <p>
 * 3.常见的构造方法：
 * 方法名                                 说明
 * public String()                    初始化新创建的String对象，以使其表示空字符序列
 * public String(char[] value)        通过当前参数中的字符数组来构造新的String。
 * String(char[] value, int offset, int count)    通过当前参数中的字符数组的一部分来构造新的String。
 * public String(byte[] bytes)        通过使用平台的默认字符集解码当前参数中的字节数组来构造新的
 * String(byte[] bytes, int offset, int length)    通过使用平台的默认字符集解码当前参数中的字节数组的一部分来构造新的String
 */
public class StringDemo1 {
    public static void main(String[] args) {
/*

        String s = "";//1
        for (int i = 0; i < 10; i++) {
            s += i; //每次都创建一个新对象
        }

        System.out.println("========");
*/

        //字符串值不可改变：放到常量池中
        String s1 = "abc";//一个对象
        String s11 = "abc";//一个对象
        String ss2 = new String("abc");
        String ss3 = new String("abc");

        System.out.println(s1 == s11);//true
        System.out.println(s1 == ss2);//false
        System.out.println(ss2 == ss3);//false
        System.out.println("====");
        System.out.println(s1.equals(s11));//true
        System.out.println(s1.equals(ss2));//true


        s1 += "d";         //一个新对象，s1的引用指向 新对象
        String a = "xxx";   //一个新对象
        String b = "xxx";   //共享常量池中的xxx ，引用指向 xxx
        s1 = "xxx";           //s1的引用指向 xxx
        System.out.println(a == b);

        System.out.println(s1 == b);
        //构造方法：new 构造方法 ：堆内存
        String s = new String();
        System.out.println("字符串s=" + s);
        //====构造方法=====
        char[] c = new char[]{'a', 'b', 'c', 'd'};
        String s2 = new String(c);
        System.out.println("字符串s2=" + s2);
        String s3 = new String(c, 1, 2);
        System.out.println("字符串s3=" + s3);

        byte[] bytes = {97, 98, 99, 100, 101};
        String s4 = new String(bytes);
        String s5 = new String(bytes, 1, 3);
        System.out.println(s4.toString());//返回的是字符串数据：方法被重写了
        System.out.println(s5);

    }
}
