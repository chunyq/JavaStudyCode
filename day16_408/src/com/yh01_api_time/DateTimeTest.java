package com.yh01_api_time;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName:DateTimeTest
 * Package:com.yh01_api_time
 *
 * @Author 86183
 * @Create 2024/4/8 11:55
 */
public class DateTimeTest {
    /*
     * Date类的使用
     *
     * |--java.util.Date
     *   > 两个构造器的使用
     *   > 两个方法的使用：①toString() ② long getTime()
     *       |----java.sql.Date: 对应着数据库中的date类型
     */

    @Test
    public void test1() {
        //创建一个基于当前系统时间的Date实例
        Date date1 = new Date();
        System.out.println(date1.toString()); //Mon Apr 08 12:04:25 CST 2024

        long millTimes = date1.getTime(); //获取从1970年到现在的毫秒值差
        System.out.println("对应的毫秒数为：" + millTimes);

        Date date2 = new Date(123723494244L); //创建一个指定时间戳的Date实例
        System.out.println(date2.toString());
    }

    @Test
    public void test2() {
        java.sql.Date date = new java.sql.Date(123723494244L);
        System.out.println(date.toString()); //1973-12-03
        System.out.println(date.getTime()); //123723494244
    }

    /*
     * SimpleDateFormat类：用于日期时间的格式化和解析
     *
     * 格式化：日期--->字符串
     * 解析：字符串 ---> 日期
     *
     * */

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化：日期---->字符串
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);  //2024/4/8 下午12:11

        //解析：字符串--->日期
        //ParseException解析异常，参数的字符串不满足SimpleDateFormat可以识别的格式
        //Date date3 = sdf.parse("2024/4/8 下午12:11");
        Date date2 = sdf.parse("2024-12-05 14:27:12");
        System.out.println(date2);  //Mon Apr 08 12:11:00 CST 2024

    }


    /*
     * Calendar:日历类
     * ① 实例化 由于Calendar是一个抽象类，所以我们需要创建其子类的实例。这里我们通过Calendar的静态方法
     *          getInstance()即可获取
     *
     * ②常用方法：get(int field) / set(int field,xx) / add(int field,xx) / getTime() / setTime()
     * */

    @Test
    public void test4() {
        //直接调用抽象类Calendar的静态方法getInstance()
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        //测试方法
        //get(int field)
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


        //set(int field,xx)
        calendar.set(Calendar.DAY_OF_MONTH, 23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add(int field,xx)
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //getTime() : Calendar --> Date
        Date date = calendar.getTime();
        System.out.println(date);
    }


    //jdk8后的时间类
    /*
    * - 可变性：像日期和时间这样的类应该是不可变的。
     - 偏移性：Date中的年份是从1900开始的，而月份都从0开始。
     - 格式化：格式化只对Date有用，Calendar则不行。
     - 此外，它们也不是线程安全的；不能处理闰秒等。
    *
    * */
    @Test
    public void test5() {
        String s1 = "hello";
        String s2 = s1.replace('l', 'w'); //String的不可变性
        System.out.println(s1);  //hello
        //体会Calendar的可变性
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 23); //初始是8
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); //23
    }

    @Test
    public void test6() {
        //偏移性：Date中的年份是从1900开始的，而月份都从0开始。
        Date date = new Date(2024, 4, 8);
        System.out.println(date);
        //Thu May 08 00:00:00 CST 3924
        //3924 = 1900 + 2024 May = April + 1
    }


    /*
     * JDK8的api:LocalDate \ LocalTime \ LocalDateTime
     * */
    @Test
    public void test7() {
        //now():获取当前日期和时间对应的实例
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate); //2024-04-08
        System.out.println(localTime);//17:30:50.199698200
        System.out.println(localDateTime);//2024-04-08T17:30:50.199698200


    }
}


