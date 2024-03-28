package com.oop;

import java.util.Date;

/**
 * ClassName:Person
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/28 15:17
 */
//继承
public class Person {
    //属性公有化
    public String name;
    public int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return name;
    }
}
