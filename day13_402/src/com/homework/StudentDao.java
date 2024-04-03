package com.homework;

import java.util.Scanner;

/**
 * ClassName:StudentDao
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/2 19:02
 */
public class StudentDao {
    //对象数组存储学生信息
    Student students[] = new Student[5];
    int count = 0; //记录当前记录的学生人数
    Scanner sc = new Scanner(System.in);


    //添加学生信息
    protected void add() {

        if (count >= students.length) {
            System.out.println("学生表已满，无法添加");
            return; //退出方法
        }
        System.out.print("请输入学号：");
        int id = sc.nextInt();
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入性别：");
        char sex = sc.next().charAt(0);
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        students[count++] = new Student(id, name, sex, age);
        System.out.println("学生信息添加成功！");

    }

    //查询学生信息
    protected void select() {
        System.out.println("--------------[查询结果]--------------------");
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                flag = true;
                System.out.println("学号\t\t姓名\t\t性别\t年龄");
                System.out.println(students[i].getId() + "\t" + students[i].getName() + "\t" + students[i].getSex()
                        + "\t" + students[i].getAge());
            } else {
                break;
            }
        }
        if (flag == false) {
            System.out.println("暂无学生信息，请添加");
            add();
        }


    }
}
