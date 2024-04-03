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
    //��������洢ѧ����Ϣ
    Student students[] = new Student[10];
    int count = 0; //��¼��ǰ��¼��ѧ������
    Scanner sc = new Scanner(System.in);

    //����ϵͳ����
    protected void ui() {
        System.out.println();
        System.out.println("*******************");
        System.out.println("***ѧ����Ϣ����ϵͳ***");
        System.out.println("***1- ���ѧ����Ϣ***");
        System.out.println("***2- �޸�ѧ����Ϣ***");
        System.out.println("***3- ɾ��ѧ����Ϣ***");
        System.out.println("***4- �鿴ѧ����Ϣ***");
        System.out.println("***5- �˳�ϵͳ******");
        System.out.println("*******************");
        System.out.println();
    }

    //������������֤ѧ���Ƿ��Ѵ�����ѧ����
    private boolean CheckIdExists(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //���ѧ����Ϣ
    protected void add() {

        if (count >= students.length) {
            System.out.println("ѧ�����������޷����");
            return; //�˳�����
        }
        while (true) {
            System.out.print("������ѧ�ţ�");
            String id = sc.next();
            if (CheckIdExists(id)) {
                System.out.println("��ͬѧ����ϵͳ�У��������µ�ѧ��");
            } else {
                System.out.print("������������");
                String name = sc.next();
                System.out.print("�������Ա�");
                char sex = sc.next().charAt(0);
                System.out.print("���������䣺");
                int age = sc.nextInt();
                students[count++] = new Student(id, name, sex, age);
                System.out.println("ѧ����Ϣ��ӳɹ���");
                break;
            }
        }


    }

    //ɾ��ѧ����Ϣ
    protected void delete() {
        System.out.print("������Ҫɾ����ѧ��ѧ�ţ�");
        int id = sc.nextInt();
        /*if (CheckIdExists(id)) {

        }*/

    }

    //�޸�ѧ����Ϣ
    protected void update() {

    }

    //��ѯѧ����Ϣ
    protected void select() {
        System.out.println("--------------[��ѯ���]--------------------");
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                flag = true;
                System.out.println("ѧ��\t\t����\t�Ա�\t����");
                System.out.println(students[i].getId() + "\t\t" + students[i].getName() + "\t" + students[i].getSex()
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
