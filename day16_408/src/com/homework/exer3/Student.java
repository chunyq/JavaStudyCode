package com.homework.exer3;

import java.util.Objects;

/**
 * ClassName:Student
 * Package:com.homework.exer3
 *
 * @Author 86183
 * @Create 2024/4/8 20:43
 */
public class Student {
    private String name; //姓名
    private int age;
    private char sex;
    private double scorce; //成绩

    public Student() {
    }

    public Student(String name, int age, char sex, double scorce) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.scorce = scorce;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getScorce() {
        return scorce;
    }

    public void setScorce(double scorce) {
        this.scorce = scorce;
    }

    //重写toString()方法

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", scorce=" + scorce +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && sex == student.sex && Double.compare(student.scorce, scorce) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, scorce);
    }
}
