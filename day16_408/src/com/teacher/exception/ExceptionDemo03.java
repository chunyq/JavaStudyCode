package com.teacher.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 异常的处理方式：
 * 1.捕获异常：
 * try-catch  try-catch-catch..  try-catch...-finally    try-finally
 * <p>
 * finally不能单独使用。必须配合着try...catch使用
 */
public class ExceptionDemo03 {

    public static void main(String[] args) {
        int i = test01();
        System.out.println("返回值：" + i);


    }
    // finally中如果没有return 数据， try-catch 都必须返回数据
    // 返回的数据是否确定？？  不确定

    // finally中如果有return 数据， try-catch 是否都必须返回数据？？   可以返回 也可以不返回
    // 返回的数据是否确定？？ 确定
    public static int test01() {
        Scanner sc = new Scanner(System.in);
        try {    //可能会出现异常的代码
            System.out.println("请输入一个int数据");
            int x = sc.nextInt();//InputMismatchException 输入不匹配异常
            System.out.println(10 / x);// ArithmeticException 算术异常
            System.out.println("xxx".charAt(x));
            return 1;

        } catch (InputMismatchException e) {  // 捕获匹配的异常
            System.out.println("输入不匹配异常");
            //System.exit(0);
            return 2;
        } catch (ArithmeticException e) {
            System.out.println("算术异常");
            return 3;
        } catch (Exception e) {// 总的异常
            System.out.println("其他异常统一的解决方案");
            //return 4;
        } finally {//最后的工作，一般用来释放资源
            //当只有在try或者catch中强制退出JVM,此时finally才不会执行,否则finally永远会执行。
            System.out.println("最终都会执行的代码");
            return 5;
        }
    }
}
