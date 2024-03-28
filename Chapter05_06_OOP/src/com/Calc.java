package com;

import java.util.Scanner;

/**
 * ClassName:MethodDemo1 Package:com
 *
 * @Author zsx(YQ)
 * @Create 2024/3/27 10:01
 * @Version 1.0
 */
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            welcome();
            System.out.print("���������Ĳ�����");
            int opr = sc.nextInt();
            switch (opr) {
                case 1:
                    System.out.print("�������һ��������");
                    int i1 = sc.nextInt();
                    System.out.print("������ڶ���������");
                    int i2 = sc.nextInt();
                    add(i1, i2);
                    break;
                case 2:
                    System.out.print("�������һ��С����");
                    double d1 = sc.nextDouble();
                    System.out.print("������ڶ���С����");
                    double d2 = sc.nextDouble();
                    System.out.println("���Ϊ" + add(d1, d2));
                    break;
                case 3:
                    System.out.print("�������һ������");
                    double n1 = sc.nextDouble();
                    System.out.print("������ڶ�������");
                    double n2 = sc.nextDouble();
                    System.out.println("���Ϊ" + jian(n1, n2));
                    break;
                case 4:
                    System.out.print("�������һ������");
                    double n3 = sc.nextDouble();
                    System.out.print("������ڶ�������");
                    double n4 = sc.nextDouble();
                    System.out.println("���Ϊ" + cheng(n3, n4));
                    break;
                case 5:
                    System.out.print("�������һ������");
                    double n5 = sc.nextDouble();
                    System.out.print("������ڶ�������");
                    double n6 = sc.nextDouble();
                    double s = chu(n5, n6);

                    System.out.println("���Ϊ" + s);
                    break;


                case 6:
                    System.out.print("�������һ������");
                    int n7 = sc.nextInt();
                    System.out.print("������ڶ�������");
                    int n8 = sc.nextInt();
                    System.out.println("�ȽϽ��Ϊ" + equals(n7, n8));
                    break;
                case 7:
                    System.out.println("��лʹ�ã��´ι���");
                    return;
            }
        } while (true);
    }

    //�����������ܷ���
    public static void welcome() {
        System.out.println();
        System.out.println("��ӭʹ�ü�������");
        System.out.println("��ѡ�����㣺");
        System.out.println("1.�����ӷ�");
        System.out.println("2.С���ӷ�");
        System.out.println("3.����");
        System.out.println("4.�˷�");
        System.out.println("5.����");
        System.out.println("6.�Ƚ����������Ƿ����");
        System.out.println("7.�˳�");
    }

    public static void add(int x, int y) {
        System.out.println("���Ϊ��" + (x + y));
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static float jian(double x, double y) {
        return (float) (x - y);
    }

    public static double cheng(double x, double y) {
        return x * y;
    }

    public static float chu(double x, double y) {
        if (y == 0) {
            System.out.println("�������󣬳�������Ϊ0,");
            return Float.NaN;
        } else {
            return (float) (x / y);
        }

    }

    public static boolean equals(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }
}
