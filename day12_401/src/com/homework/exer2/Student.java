package com.homework.exer2;

/**
 * ClassName:Student
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/4/1 18:54
 */
public class Student {
    private String id; //Ñ§ºÅ
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String id, String name, char sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
