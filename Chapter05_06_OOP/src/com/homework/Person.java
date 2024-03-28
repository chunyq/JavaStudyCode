package com.homework;

/**
 * ClassName:Person
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:03
 */
public class Person {
    //成员属性
    private String name;
    private double age;

    //构造方法
    public Person() {
    }

    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


}
