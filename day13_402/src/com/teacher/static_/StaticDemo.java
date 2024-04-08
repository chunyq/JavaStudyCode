package com.yh.static_;

/**
 * 1.static  静态的 类的 共享的
 * 2.修饰成员变量  成员方法
 * 有       没有
 * 成员变量根据有没有static修饰：  类变量  实例变量
 * 成员方法根据有没有static修饰：  类方法  实例方法
 * 类成员   实例成员
 * 所有对象共享的   对象独有的
 * 饮水机(用静态修饰)
 * 水杯(不能用静态修饰)
 * 类成员： 类名.调用  也可以 对象.调用
 * 实例成员：只能通过 对象. 调用
 * 3.特点：
 * a:随着类的加载而加载
 * b:优先于对象存在
 * c:被类的所有对象共享
 * d:可以通过类名调用
 * 4.注意事项：
 * a:在静态方法中是没有this关键字的
 * 如何理解呢?
 * 静态是随着类的加载而加载，this是随着对象的创建而存在。
 * 静态比对象先存在。
 * b:静态方法只能访问静态的成员变量和静态的成员方法
 * c:非静态方法可以访问静态和非静态成员
 * 总结：
 * 静态只能访问静态。非静态可以访问静态也可以访问非静态
 * <p>
 * 5.静态变量和实例变量的区别
 * 所属不同
 * 静态变量属于类，所以也称为类变量
 * 成员变量属于对象，所以也称之为实例变量(对象变量)
 * 内存中位置不同
 * 静态变量存储于   方法区的静态区
 * 成员变量存储于堆内存中
 * 生命周期不同
 * 静态变量随着类的加载而加载，随着类的消失而消失
 * 成员变量随着对象的创建而创建，随着对象的消失而消失
 * 调用不同
 * 静态变量可以通过类名调用，也可以通过对象来调用
 * 成员变量只能通过对象名调用
 */
public class StaticDemo {
    int a = 1;
    static int b = 2;

    //实例方法、非静态方法
    public void test01() {
        System.out.println("非静态方法--1");
        System.out.println(this.a);
        System.out.println(b);
        test03();
        test04();
    }

    //类方法 静态方法
    public static void test02() {
        System.out.println("静态方法--2");
        //System.out.println(this.a);
        System.out.println(b);
        test04();
    }

    public void test03() {
        System.out.println("非静态方法-3");
        System.out.println(a);
        System.out.println(b);
    }

    public static void test04() {
        System.out.println("静态方法--4");
        //System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(StaticDemo.b);

        StaticDemo demo = new StaticDemo();
        System.out.println(demo.a); // 1
        System.out.println(demo.b);//2
        demo.a = 11;
        demo.b = 22;

        System.out.println(demo.a); // 11
        System.out.println(demo.b);//22
        //demo.test01();
        //StaticDemo.test02();

        StaticDemo demo2 = new StaticDemo();
        System.out.println(demo2.a);// 1
        System.out.println(demo2.b);//22

        StaticDemo demo3 = new StaticDemo();
        System.out.println(demo2.a);
        System.out.println(demo2.b);
    }
}
