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

    //���
    public void addStudent() {
        System.out.print("������ѧ��������");
        String name = sc.nextLine();
        System.out.print("������ѧ�����䣺");
        int age = sc.nextInt();
        students.add(new Student(name, age));
        System.out.println("ѧ����Ϣ��ӳɹ���");
    }

    //ɾ��
    public void deleteStudent() {
        System.out.print("������Ҫɾ����ѧ��������");
        String name = sc.nextLine();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
                System.out.println("��Ϣɾ���ɹ�");
                return;
            }
        }
        System.out.println("δ�ҵ���ѧ����Ϣ");
    }

    //����
    public void findStudent() {
        System.out.print("������Ҫ���ҵ�ѧ��������");
        String name = sc.nextLine();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("�ҵ���Ϣ��" + student);
                return;
            }
        }
        System.out.println("δ�ҵ���ѧ����Ϣ");
    }

    //��ʾ������Ϣ
    public void displayAllStudent() {
        System.out.println("����ѧ����Ϣ��");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //�˵�
    public void start() {
        while (true) {
            System.out.println();
            System.out.println("*******************");
            System.out.println(" ѧ����Ϣ����ϵͳ");
            System.out.println("*******************");
            System.out.println("  1- ���ѧ����Ϣ");
            System.out.println("  2- ������������ѧ��");
            System.out.println("  3- ɾ��ѧ����Ϣ");
            System.out.println("  4- ��ʾ����ѧ��");
            System.out.println("  5- �˳�ϵͳ");
            System.out.println("*******************");
            System.out.print("���������ѡ��");
            int choice = sc.nextInt();
            sc.nextLine(); // ���ĵ�����ѡ���Ļ��з�

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
                    System.out.println("ϵͳ�˳���");
                    sc.close();
                    return;
                default:
                    System.out.println("��Ч��ѡ�����������롣");
            }
        }
    }

}
