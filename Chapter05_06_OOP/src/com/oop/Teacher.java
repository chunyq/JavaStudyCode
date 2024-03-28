package com.oop;

/**
 * ClassName:Teacher
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 20:01
 */
/*
老师类Teacher
    属性:
    姓名name
    年龄age
    讲课内容content
    行为:
    吃饭eat()
    讲课teach（String kc）
 */
public class Teacher {
    private String name;
    private int age;
    private String content;

    //构造方法
    public Teacher(){}
    public Teacher(String name,int age,String content){
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
        System.out.println("年龄为" + age + "的" + name + "老师正在吃饭....");
    }

    public void teach(String kc) {
        System.out.println("年龄为"+age+"的"+name+"老师正在亢奋的讲着"+kc+"的知识......");
    }
}
