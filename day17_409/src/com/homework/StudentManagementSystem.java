package com.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * ClassName:StudentManagementSystem
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/9 18:57
 */
public class StudentManagementSystem {
    private Collection<Student> students;
    private Scanner sc;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    //添加
    public void addStudent() {
        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();
        students.add(new Student(name, age));
        System.out.println("学生信息添加成功！");
    }

    //删除
    public void deleteStudent() {
        System.out.print("请输入要删除的学生姓名：");
        String name = sc.nextLine();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
                System.out.println("信息删除成功");
                return;
            }
        }
        System.out.println("未找到该学生信息");
    }

    //查找
    public void findStudent() {
        System.out.print("请输入要查找的学生姓名：");
        String name = sc.nextLine();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("找到信息：" + student);
                return;
            }
        }
        System.out.println("未找到该学生信息");
    }

    //显示所有信息
    public void displayAllStudent() {
        System.out.println("所有学生信息：");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //菜单
    public void start() {
        while (true) {
            System.out.println();
            System.out.println("*******************");
            System.out.println(" 学生信息管理系统");
            System.out.println("*******************");
            System.out.println("  1- 添加学生信息");
            System.out.println("  2- 根据姓名查找学生");
            System.out.println("  3- 删除学生信息");
            System.out.println("  4- 显示所有学生");
            System.out.println("  5- 退出系统");
            System.out.println("*******************");
            System.out.print("请输入你的选择：");
            int choice = sc.nextInt();
            sc.nextLine(); // 消耗掉输入选择后的换行符

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    findStudent();
                    break;
                case 3:
                    displayAllStudent();
                    deleteStudent();
                    break;
                case 4:
                    displayAllStudent();
                    break;
                case 5:
                    System.out.println("系统退出。");
                    sc.close();
                    return;
                default:
                    System.out.println("无效的选择，请重新输入。");
            }
        }
    }

}
