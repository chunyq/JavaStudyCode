package com.oop;

/**
 * ClassName:Student2
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/28 15:21
 */
//ͨ���̳�Person��Student2��Ĵ���
//Person�е������뷽����Student2������
public class Student2 extends Person {

    //�̳и���Ĺ��췽�����ùؼ���super
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
