package com.homework;

/**
 * ClassName:Student
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/9 18:55
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "学生信息{" +
                "姓名：'" + name + '\'' +
                ", 年龄：" + age +
                '}';
    }


}
