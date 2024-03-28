package com.homework;

/**
 * ClassName:PersonTest
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:04
 */
/*
定义测试类:根据如下需求创建多个对象(分别使用空参和满参).
老王-35    小芳-23
通过两个对象,比较谁的年龄大,并打印出来.
例:  老王年龄比较大
 */
public class PersonTest {
    public static void main(String[] args) {
        //空参
        Person p1 = new Person();
        p1.setName("老王");
        p1.setAge(35);
        //满参
        Person p2 = new Person("小芳", 23);

        //比较年龄
        if (p1.getAge() > p2.getAge()) {
            System.out.println(p1.getName() + "年龄比较大");
        } else {
            System.out.println(p2.getName() + "年龄比较大");
        }
    }
}
