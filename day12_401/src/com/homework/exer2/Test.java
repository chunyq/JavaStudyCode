package com.homework.exer2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * ClassName:Test
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/4/1 19:09
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDao dao = new StudentDao();
        while (true) {
            dao.ui();
            System.out.print("���������ѡ��");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    dao.add();
                    break;
                case 2:
                    dao.select();
                    dao.update();
                    break;
                case 3:
                    dao.select();
                    dao.delete();
                    break;
                case 4:
                    dao.select();
                    break;
                case 5:
                    System.out.println("��лʹ�ã���ӭ�´�������");
                    sc.close();
                    return;
                default:
                    System.out.println("�����������������룡");
            }
        }
    }
}
