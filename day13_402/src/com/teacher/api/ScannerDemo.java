package com.yh.api;

import java.util.Scanner;

/**
 * @Author yh
 * @create 15:01
 */
public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();//扫描一行并返回String
        System.out.println("s::" + s);
        System.out.println("======");
        int i = scanner.nextInt();  //扫描，并返回int

        double v = scanner.nextDouble();  //扫描，并返回double

        System.out.println(i + " :: " + v);

        String next = scanner.next();  //扫描，并返回String
        System.out.println(next);

    }
}
