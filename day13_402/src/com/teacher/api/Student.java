package com.yh.api;

import java.util.Objects;

/**
 * @Author yh
 * @create 15:48
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

    //重写之后返回的是对象的数据信息
    @Override
    public String toString() {
        return "Student{" +
                "姓名='" + name + '\'' +
                ",年龄：" + age +
                '}';
    }

    //重写之后：比较的是对象的每一个属性值是否相等
    //所有属性值相同即返回true(即使不是同一个对象)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

}
