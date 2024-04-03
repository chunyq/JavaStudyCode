package com.homework.exer2;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.util.Scanner;

/**
 * ClassName:StudentDao
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/4/1 18:58
 */
public class StudentDao {
    //对象数组存储学生信息
    Student students[] = new Student[10];
    int count = 0; //记录当前记录的学生人数
    Scanner sc = new Scanner(System.in);

    //管理系统界面
    protected void ui() {
        System.out.println();
        System.out.println("*******************");
        System.out.println("***学生信息管理系统***");
        System.out.println("***1- 添加学生信息***");
        System.out.println("***2- 修改学生信息***");
        System.out.println("***3- 删除学生信息***");
        System.out.println("***4- 查看学生信息***");
        System.out.println("***5- 退出系统******");
        System.out.println("*******************");
        System.out.println();
    }

    //辅助方法：验证学号是否已存在于学生表
    private boolean CheckIdExists(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //添加学生信息
    protected void add() {

        if (count >= students.length) {
            System.out.println("学生表已满，无法添加");
            return; //退出方法
        }
        while (true) {
            System.out.print("请输入学号：");
            String id = sc.next();
            if (CheckIdExists(id)) {
                System.out.println("该同学已在系统中，请输入新的学号");
            } else {
                System.out.print("请输入姓名：");
                String name = sc.next();
                System.out.print("请输入性别：");
                char sex = sc.next().charAt(0);
                System.out.print("请输入年龄：");
                int age = sc.nextInt();
                students[count++] = new Student(id, name, sex, age);
                System.out.println("学生信息添加成功！");
                break;
            }
        }


    }

    //删除学生信息
    protected void delete() {
        System.out.print("请输入要删除的学生学号：");
        int id = sc.nextInt();
        /*if (CheckIdExists(id)) {

        }*/

    }

    //修改学生信息
    protected void update() {

    }

    //查询学生信息
    protected void select() {
        System.out.println("--------------[查询结果]--------------------");
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                flag = true;
                System.out.println("学号\t\t姓名\t性别\t年龄");
                System.out.println(students[i].getId() + "\t\t" + students[i].getName() + "\t" + students[i].getSex()
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
