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
public class ExceptionDemo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {    //可能会出现异常的代码
            System.out.println("请输入一个int数据");
            int x = sc.nextInt();//InputMismatchException 输入不匹配异常
            System.out.println(10 / x);// ArithmeticException 算术异常
            System.out.println("xxx".charAt(x));

        } catch (InputMismatchException | ArithmeticException e) {  // 捕获匹配的异常
            System.out.println("输入不匹配异常");
            //System.exit(0);
        } catch (Exception e) {// 总的异常
            System.out.println("其他异常统一的解决方案");
        } finally {//最后的工作，一般用来释放资源
            //当只有在try或者catch中强制退出JVM,此时finally才不会执行,否则finally永远会执行。
            System.out.println("最终都会执行的代码");
        }

/*
        try{    //可能会出现异常的代码
            System.out.println("请输入一个int数据");
            int x = sc.nextInt();//InputMismatchException 输入不匹配异常
            System.out.println(10/x);// ArithmeticException 算术异常
            System.out.println( "xxx".charAt(x) );

        }catch(InputMismatchException  e){  // 捕获匹配的异常
            System.out.println("输入不匹配异常");
            //System.exit(0);
        }catch (ArithmeticException e){
            System.out.println("算术异常");
        }catch (Exception e){// 总的异常
            System.out.println("其他异常统一的解决方案");
        }finally {//最后的工作，一般用来释放资源
            //当只有在try或者catch中强制退出JVM,此时finally才不会执行,否则finally永远会执行。
            System.out.println("最终都会执行的代码");
        }*/


    }
}
