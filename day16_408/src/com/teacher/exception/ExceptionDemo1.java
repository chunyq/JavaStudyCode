package com.teacher.exception;


import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @Author yh
 * @create 14:06
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55};
        System.out.println(a[0]);
        System.out.println(a[3]);
        //System.out.println( a[5]);//ArrayIndexOutOfBoundsException

        String s = "abc";
        //s = null;
        char c = s.charAt(2);//NullPointerException 空指针问题
        //c = s.charAt(5);//StringIndexOutOfBoundsException
        System.out.println(c);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个int数据");
        int x = sc.nextInt();//InputMismatchException 输入不匹配异常
        System.out.println(10 / x);// ArithmeticException 算术异常

        Object o = new Object();
        //o=new String("xxx");
        String str = (String) o;//ClassCastException 类转换异常
        System.out.println(str);

        System.out.println("====编译期异常=====");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //sdf.parse("2024-04-08");

    }
}
