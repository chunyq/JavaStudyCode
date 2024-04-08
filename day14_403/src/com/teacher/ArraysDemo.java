package com.teacher;

import java.util.Arrays;

/**
 * Arrays:数组工具类
 * java.util.Arrays 此类包含用来操作数组的各种方法，比如排序和搜索等。
 * 其所有方法均为静态方法，调用起来非常简单。简单来说：Arrays这个是专门用来操作数组相关的工具类
 * <p>
 * Arrays类常用方法：
 * 方法名                                     	说明
 * public static  String  toString(int[] a)	返回指定数组内容的字符串表示形式。
 * public static void sort(int[] a)        	对指定的int型数组按数字升序进行排序。
 */
public class ArraysDemo {
    public static void main(String[] args) {

        int[] a = {11, 55, 33, 88, 22, 44};
        String[] s = {"break", "continue", "abstract", "for", "do"};

        Arrays.sort(a);//升序排列
        //Arrays.sort(s);
        Arrays.sort(s, 1, 4);//区间排序

        String s2 = Arrays.toString(a);//转换为字符串
        System.out.println(s2);

        System.out.println(Arrays.toString(s));


    }
}
