package com.oop;

/**
 * ClassName:Student
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 20:08
 */
/*
属性:
    姓名name
    年龄age
    学习内容content
    行为:
    吃饭eat()
    学习study(String zj)    * 带参数的方法
 */
public class Student {
    private String name;
    private int age;
    //学习内容
    private String content;


    //构造方法(构造器)
    public Student(){
    }
    public Student(String name,int age,String content){
        this.name = name;
        this.age = age;
        this.content = content;
    }
    //成员方法
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public void eat() {
        System.out.println("年龄为" + age + "的" + name + "同学正在吃饭....");
    }
    public void study(String zj){
        System.out.println("年龄为"+age+"的"+name+"同学正在专心致志的听着"+zj+"的知识......");
    }
}
