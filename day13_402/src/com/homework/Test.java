package com.homework;

/**
 * ClassName:Test
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/2 19:10
 */
public class Test {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        //添加学生1
        System.out.println("添加学生1");
        studentDao.add();
        //添加学生2
        System.out.println("添加学生2");
        studentDao.add();
        //查询
        studentDao.select();
        //判断两个学生对象是否相等
        Student s1 = studentDao.students[0];
        Student s2 = studentDao.students[1];
        if (s1.equals(s2)) {
            System.out.println("两名同学的信息相同");
        } else {
            System.out.println("两名同学的信息不同");
        }


    }
}
