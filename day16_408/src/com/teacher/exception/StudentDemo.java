package com.yh.exception;

/**
 * @Author yh
 * @create 16:00
 */
public class StudentDemo {
    public static void main(String[] args) throws LargeThan120Exception, LessThan0Exception {
        Student stu = new Student();
        stu.setName("jack");
        stu.setAge(21);
        //stu.setAge(-11);
        stu.setAge(140);

        System.out.println(stu);
    }
}
