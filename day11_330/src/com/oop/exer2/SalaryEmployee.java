package com.oop.exer2;

import java.util.Scanner;

/**
 * ClassName:SalaryEmployee
 * Package:com.oop.exer2
 *
 * @Author 86183
 * @Create 2024/3/30 11:23
 */
public class SalaryEmployee extends Employee {
    private int e; //销售额
    private double tc; //提成率

    public SalaryEmployee() {
    }

    public SalaryEmployee(String name, double salary, int month, double tc) {
        super(name, salary, month);
        this.tc = tc;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public double getTc() {
        return tc;
    }

    public void setTc(double tc) {
        this.tc = tc;
    }

    public double getMoney(int e) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入当前月份：");
        int month = sc.nextInt();
        int gz = (int) super.getMoney(month);
        double x = e * tc;
        System.out.println("销售额" + e + "元，提成率" + tc + ",销售提成：" + x + "元");
        System.out.println("本月总工资" + (gz + x) + "元");
        return gz + x;
    }

    public void play() {
        System.out.println("我喜欢玩魂斗罗");
    }
}
