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
    //��������洢ѧ����Ϣ
    Student students[] = new Student[5];
    int count = 0; //��¼��ǰ��¼��ѧ������
    Scanner sc = new Scanner(System.in);


    //���ѧ����Ϣ
    protected void add() {

        if (count >= students.length) {
            System.out.println("ѧ�����������޷����");
            return; //�˳�����
        }
        System.out.print("������ѧ�ţ�");
        int id = sc.nextInt();
        System.out.print("������������");
        String name = sc.next();
        System.out.print("�������Ա�");
        char sex = sc.next().charAt(0);
        System.out.print("���������䣺");
        int age = sc.nextInt();
        students[count++] = new Student(id, name, sex, age);
        System.out.println("ѧ����Ϣ��ӳɹ���");

    }

    //��ѯѧ����Ϣ
    protected void select() {
        System.out.println("--------------[��ѯ���]--------------------");
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                flag = true;
                System.out.println("ѧ��\t\t����\t\t�Ա�\t����");
                System.out.println(students[i].getId() + "\t" + students[i].getName() + "\t" + students[i].getSex()
                        + "\t" + students[i].getAge());
            } else {
                break;
            }
        }
        if (flag == false) {
            System.out.println("����ѧ����Ϣ�������");
            add();
        }


    }
}
