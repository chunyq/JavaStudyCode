package com.yh.exception;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author yh
 * @create 15:18
 */
public class ExceptionDemo04 {

    public static void main(String[] args) {
        try {
            test01();
        } catch (ParseException e) {
            //System.out.println(e.toString());
            //Unparseable date: "2024-04月份08 10:18:41"
            //System.out.println(e.getMessage());
            //System.out.println(e.getStackTrace());
            //throw new RuntimeException(e);
            e.printStackTrace();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void test01() throws ParseException, InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String str = "2024-04月份08 10:18:41";
        Date date1 = null;// 编译器异常

        date1 = sdf.parse(str);
        System.out.println(date1);

        Thread.sleep(3000);

        System.out.println("====");

    }

    public static void test02() throws FileNotFoundException {

        String path = "D://abc//a.txt";
        if (!path.endsWith("a.txt")) {
            throw new FileNotFoundException();//异常对象
        }


    }

}
