package com.oop;

/**
 * ClassName:Student2
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/28 15:21
 */
//通过继承Person简化Student2类的代码
//Person中的属性与方法，Student2都能用
public class Student2 extends Person {

    //继承父类的构造方法，用关键字super
    public Student2(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public Student2(String name, int age) {

    }

    public Student2() {

    }

    public String school;

    public String getInfo() {
        return school;
    }


}
