package com.yh01_permission_modifier.exer1;

/**
 * ClassName:Son1
 * Package:com.yh01_permission_modifier.exer1
 *
 * @Author 86183
 * @Create 2024/4/1 16:14
 */
//同一个包中子类 --> public protected default
public class Son1 extends Father {
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        son1.a = 0;
        son1.b = 0;
        son1.c = 0;
        //public
        son1.test1();
        //default(缺省)
        son1.test2();
        //protected
        son1.test3();
    }
}
