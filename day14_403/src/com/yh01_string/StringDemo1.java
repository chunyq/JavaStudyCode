package com.yh01_string;

/**
 * ClassName:StringDemo1
 * Package:com.yh01_string
 *
 * @Author 86183
 * @Create 2024/4/3 11:14
 */
public class StringDemo1 {
    public static void main(String[] args) {
        /*String s = ""; //1
        for (int i = 0; i < 10; i++) {
            s += i; //每次循环都创建一个对象
        }

        System.out.println("=========");*/

        //字符串值不可变，放入常量池中
        String s1 = "abc"; //一个对象
        String s2 = "abc"; //另一个对象
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s3 == s4); //false
        System.out.println("=========");
        System.out.println(s3.equals(s4)); //true
        System.out.println(s1.equals(s3)); //true


    }
}
