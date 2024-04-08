package com.yh.innerclass;

/**
 * 匿名内部类：直接new,没有名字的内部类（常用）
 * 简化实现类的定义
 * 前提：接口  抽象类
 */
/*
public abstract class Person {
    public abstract void study();
}
*/
public interface Person {
    public abstract void study();
}

class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person() { //Outer1$Inner11.class
            @Override
            public void study() {
                System.out.println("好好学习，天天向上！");
            }
        };
        p.study();

        new Person() {
            @Override
            public void study() {
                System.out.println("学习技术，好好挣钱！");
            }
        }.study();

        System.out.println("====");
        new Person() {
            @Override
            public void study() {
                System.out.println("上班摸鱼！！");
            }
        }.study();
    }
}
/*
// 子类 / 实现类
class Student extends Person{
    @Override
    public void study() {
        System.out.println("好好学习，天天向上！");
    }
}

class Worker extends Person{
    @Override
    public void study() {
        System.out.println("学习技术，好好挣钱！");
    }
}

class PersonDemo{
    public static void main(String[] args) {
        Person p=new Student();
        p.study();

        new Worker().study();
    }
}


 */
