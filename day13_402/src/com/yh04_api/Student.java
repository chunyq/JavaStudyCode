package com.yh04_api;

import java.util.Objects;

/**
 * ClassName:Student
 * Package:com.yh04_api
 *
 * @Author 86183
 * @Create 2024/4/2 17:06
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

    //��д֮�󷵻ص��Ƕ����������Ϣ
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    //��д֮�󣺱Ƚϵ��Ƕ����ÿһ������ֵ�Ƿ����
    //��������ֵ��ͬ������true(��ʹ����ͬһ������)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }
}
