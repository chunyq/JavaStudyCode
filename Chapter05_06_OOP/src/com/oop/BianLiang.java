package com.oop;

/**
 * ClassName:BianLiang
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/28 10:49
 */
public class BianLiang {
    //成员变量，在类之中，方法之外,可以设置修饰符,可以不初始化，有缺省值(默认值)
    String name;
    int num = 1;

    public void test1(){
        //局部变量,在方法之中，只作用于该方法，必须初始化
        int num = 4;
        System.out.println("局部变量num="+num);
        //若想调用成员变量num,需要用到关键字this
        System.out.println("成员变量num="+this.num);
        //this.num表示通过对象调用该类的成员变量
    }

    public static void main(String[] args) {
        BianLiang b = new BianLiang();
        b.test1();
    }
}
