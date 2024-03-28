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
            System.out.print("请输入您的操作：");
            int opr = sc.nextInt();
            switch (opr) {
                case 1:
                    System.out.print("请输入第一个整数：");
                    int i1 = sc.nextInt();
                    System.out.print("请输入第二个整数：");
                    int i2 = sc.nextInt();
                    add(i1, i2);
                    break;
                case 2:
                    System.out.print("请输入第一个小数：");
                    double d1 = sc.nextDouble();
                    System.out.print("请输入第二个小数：");
                    double d2 = sc.nextDouble();
                    System.out.println("结果为" + add(d1, d2));
                    break;
                case 3:
                    System.out.print("请输入第一个数：");
                    double n1 = sc.nextDouble();
                    System.out.print("请输入第二个数：");
                    double n2 = sc.nextDouble();
                    System.out.println("结果为" + jian(n1, n2));
                    break;
                case 4:
                    System.out.print("请输入第一个数：");
                    double n3 = sc.nextDouble();
                    System.out.print("请输入第二个数：");
                    double n4 = sc.nextDouble();
                    System.out.println("结果为" + cheng(n3, n4));
                    break;
                case 5:
                    System.out.print("请输入第一个数：");
                    double n5 = sc.nextDouble();
                    System.out.print("请输入第二个数：");
                    double n6 = sc.nextDouble();
                    double s = chu(n5, n6);

                    System.out.println("结果为" + s);
                    break;


                case 6:
                    System.out.print("请输入第一个数：");
                    int n7 = sc.nextInt();
                    System.out.print("请输入第二个数：");
                    int n8 = sc.nextInt();
                    System.out.println("比较结果为" + equals(n7, n8));
                    break;
                case 7:
                    System.out.println("感谢使用！下次光临");
                    return;
            }
        } while (true);
    }

    //计算器各功能方法
    public static void welcome() {
        System.out.println();
        System.out.println("欢迎使用计算器！");
        System.out.println("请选择运算：");
        System.out.println("1.整数加法");
        System.out.println("2.小数加法");
        System.out.println("3.减法");
        System.out.println("4.乘法");
        System.out.println("5.除法");
        System.out.println("6.比较两个整数是否相等");
        System.out.println("7.退出");
    }

    public static void add(int x, int y) {
        System.out.println("结果为：" + (x + y));
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
            System.out.println("输入有误，除数不可为0,");
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
