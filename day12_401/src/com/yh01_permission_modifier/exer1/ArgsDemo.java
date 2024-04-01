package com.yh01_permission_modifier.exer1;

/**
 * ClassName:ArgsDemo
 * Package:com.yunhe01_polymorphism.exer1
 *
 * @Author 86183
 * @Create 2024/4/1 14:58
 */
/*
参数和返回值
基本数据类型，直接传递或返回
引用数据类型：
    普通类：new 对象 --> 再传递/返回
    抽象类：new 子类对象--> 再传递/返回
    接口：new 实现类对象 --> 再传递/返回
 */
public class ArgsDemo {
    public static void main(String[] args) {
        StudentDemo st = new StudentDemo();
        //传递普通类参数
        st.method(new Student());
        //返回普通类
        Student student = st.getStudent();
        student.study();
    }
}

class Student {
    public void study() {
        System.out.println("好好");
    }
}

class StudentDemo {
    //把普通类当作一个参数
    public void method(Student student) {
        student.study();
    }

    //返回值类型为一个类
    public Student getStudent() {
        return new Student();
    }
}




