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
            System.out.print("请输入你的选择：");
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
                    System.out.println("感谢使用，欢迎下次再来！");
                    sc.close();
                    return;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }
}
