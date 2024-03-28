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
        //创建对象，类的实例化
        //调用无参构造创建学生对象
        Student1 student = new Student1();   //new之后，成员变量还是默认值
        Student1 student1 = new Student1("202010917230","杨祖强",(byte) 23,'男',true);


        System.out.println(student1.getNum());
    }
}
