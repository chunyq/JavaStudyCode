package com.yh.innerclass;

/*
局部内部类：定义在局部位置,只能在方法中使用
	  new 内部类()
 */
class Outer2 {
    private int num = 1;

    public void test01() {
        int a = 1;    //局部变量
        class Inner2 {//局部内部类  Outer2$1Inner2.class

            public void show2() {
                System.out.println("内部类中的方法");
                System.out.println(num);
            }
        }
        System.out.println(a);//方法内部使用
        Inner2 inner2 = new Inner2();//方法内部调用
        inner2.show2();
    }
}

public class InnerDemo2 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.test01();
    }
}
