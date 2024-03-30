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
    private int e; //���۶�
    private double tc; //�����

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
        System.out.print("�����뵱ǰ�·ݣ�");
        int month = sc.nextInt();
        int gz = (int) super.getMoney(month);
        double x = e * tc;
        System.out.println("���۶�" + e + "Ԫ�������" + tc + ",������ɣ�" + x + "Ԫ");
        System.out.println("�����ܹ���" + (gz + x) + "Ԫ");
        return gz + x;
    }

    public void play() {
        System.out.println("��ϲ����궷��");
    }
}
