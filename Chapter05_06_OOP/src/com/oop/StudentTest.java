package com.oop;

/**
 * ClassName:StudentTest
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 15:54
 */
public class StudentTest {
    public static void main(String[] args) {
        //�����������ʵ����
        //�����޲ι��촴��ѧ������
        Student1 student = new Student1();   //new֮�󣬳�Ա��������Ĭ��ֵ
        Student1 student1 = new Student1("202010917230","����ǿ",(byte) 23,'��',true);


        System.out.println(student1.getNum());
    }
}
