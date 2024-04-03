package com.homework;

import java.util.Objects;

/**
 * ClassName:Student
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/2 18:47
 */
public class Student {
    private int id;
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(int id, String name, char sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return age == student.age &&
                id == student.id &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(name, student.name);
    }
}
