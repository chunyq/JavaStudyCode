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
    String perId; //身份证号
    String name;
    char gender; //性别

    String[] hobby; //兴趣爱好
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
        System.out.println("我喜欢吃" + n);
    }

    public void oper(Account acc) {
        Scanner sc = new Scanner(System.in);
        //取款金额
        int qu = 0;
        //存款金额
        int cun = 0;
        //验证密码
        for (int i = 3; i >= 1; i--) {
            System.out.print("请输入密码:");
            int pwd = sc.nextInt();
            if (acc.checkPwd(pwd)) {
                System.out.println("密码正确！登录成功！");
                while (true) {
                    System.out.println("=============================");
                    System.out.println("======ATM存款系统=============");
                    System.out.println("======请选择您的操作：=========");
                    System.out.println("======1.查询余额===============");
                    System.out.println("======2.存款===================");
                    System.out.println("======3.取款===================");
                    System.out.println("======4.退卡===================");
                    System.out.print("请选择您的操作：");
                    int c = sc.nextInt();
                    switch (c) {
                        case 1 -> {
                            System.out.println("您正在[查看余额]");
                            acc.search();
                        }
                        case 2 -> {
                            System.out.print("请输入存款的金额：");
                            cun = sc.nextInt();
                            acc.deposit(cun);
                        }
                        case 3 -> {
                            System.out.print("请输入取款的金额：");
                            qu = sc.nextInt();
                            acc.withDraw(qu);
                        }
                        case 4 -> {
                            System.out.println("退卡成功！");
                            System.out.println("感谢使用ATM机，再见！");
                            return;
                        }
                        default -> System.out.println("输入有误，请重新输入！");
                    }
                }
            } else {
                System.out.println("密码错误，你还有" + (i - 1) + "次机会");
            }
        }
        System.out.println("次数已用尽，请联系管理员重置密码");


    }
}
