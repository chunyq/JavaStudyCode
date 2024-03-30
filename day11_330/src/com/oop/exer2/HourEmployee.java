package com.oop.exer2;

import java.util.Scanner;

/**
 * ClassName:HourEmployee
 * Package:com.oop.exer2
 *
 * @Author 86183
 * @Create 2024/3/30 11:04
 */
public class HourEmployee extends Employee{
    private double hSalary; //时薪
    private int hours; //时长

    public HourEmployee() {
    }

    public HourEmployee(String name, double salary, int month, double hSalary) {
        super(name, salary, month);
        this.hSalary = hSalary;
    }

    public double gethSalary() {
        return hSalary;
    }

    public void sethSalary(double hSalary) {
        this.hSalary = hSalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getMoney(int hours){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入当前月份：");
        int month = sc.nextInt();
        int gz = (int) super.getMoney(month);
        double x = 0;
        if (hours > 20) {
            x = hSalary*1.5*(hours-20) + hSalary*20;
        } else {
            x = hSalary*hours;
        }
        System.out.println("时薪"+hSalary+"元，时长"+hours+"小时,小时工资："+x+"元");
        System.out.println("本月总工资"+(gz+x)+"元");
        return gz+x;
    }

    public void eat(){
        System.out.println("我喜欢吃红烧肉");
    }
}
