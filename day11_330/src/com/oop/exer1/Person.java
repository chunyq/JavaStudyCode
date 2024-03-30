package com.oop.exer1;

import java.util.Scanner;

/**
 * ClassName:Person
 * Package:com.oop.exer1
 *
 * @Author 86183
 * @Create 2024/3/30 10:03
 */
public class Person {
    String perId; //���֤��
    String name;
    char gender; //�Ա�

    String[] hobby; //��Ȥ����
    Phone phone;

    public Person() {
    }

    public Person(String perId, String name, char gender, String[] hobby, Phone phone) {
        this.perId = perId;
        this.name = name;
        this.gender = gender;
        this.hobby = hobby;
        this.phone = phone;
    }

    public void eat(String n) {
        System.out.println("��ϲ����" + n);
    }

    public void oper(Account acc) {
        Scanner sc = new Scanner(System.in);
        //ȡ����
        int qu = 0;
        //�����
        int cun = 0;
        //��֤����
        for (int i = 3; i >= 1; i--) {
            System.out.print("����������:");
            int pwd = sc.nextInt();
            if (acc.checkPwd(pwd)) {
                System.out.println("������ȷ����¼�ɹ���");
                while (true) {
                    System.out.println("=============================");
                    System.out.println("======ATM���ϵͳ=============");
                    System.out.println("======��ѡ�����Ĳ�����=========");
                    System.out.println("======1.��ѯ���===============");
                    System.out.println("======2.���===================");
                    System.out.println("======3.ȡ��===================");
                    System.out.println("======4.�˿�===================");
                    System.out.print("��ѡ�����Ĳ�����");
                    int c = sc.nextInt();
                    switch (c) {
                        case 1 -> {
                            System.out.println("������[�鿴���]");
                            acc.search();
                        }
                        case 2 -> {
                            System.out.print("��������Ľ�");
                            cun = sc.nextInt();
                            acc.deposit(cun);
                        }
                        case 3 -> {
                            System.out.print("������ȡ��Ľ�");
                            qu = sc.nextInt();
                            acc.withDraw(qu);
                        }
                        case 4 -> {
                            System.out.println("�˿��ɹ���");
                            System.out.println("��лʹ��ATM�����ټ���");
                            return;
                        }
                        default -> System.out.println("�����������������룡");
                    }
                }
            } else {
                System.out.println("��������㻹��" + (i - 1) + "�λ���");
            }
        }
        System.out.println("�������þ�������ϵ����Ա��������");


    }
}
