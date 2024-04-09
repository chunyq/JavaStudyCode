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
     * Date���ʹ��
     *
     * |--java.util.Date
     *   > ������������ʹ��
     *   > ����������ʹ�ã���toString() �� long getTime()
     *       |----java.sql.Date: ��Ӧ�����ݿ��е�date����
     */

    @Test
    public void test1() {
        //����һ�����ڵ�ǰϵͳʱ���Dateʵ��
        Date date1 = new Date();
        System.out.println(date1.toString()); //Mon Apr 08 12:04:25 CST 2024

        long millTimes = date1.getTime(); //��ȡ��1970�굽���ڵĺ���ֵ��
        System.out.println("��Ӧ�ĺ�����Ϊ��" + millTimes);

        Date date2 = new Date(123723494244L); //����һ��ָ��ʱ�����Dateʵ��
        System.out.println(date2.toString());
    }

    @Test
    public void test2() {
        java.sql.Date date = new java.sql.Date(123723494244L);
        System.out.println(date.toString()); //1973-12-03
        System.out.println(date.getTime()); //123723494244
    }

    /*
     * SimpleDateFormat�ࣺ��������ʱ��ĸ�ʽ���ͽ���
     *
     * ��ʽ��������--->�ַ���
     * �������ַ��� ---> ����
     *
     * */

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //��ʽ��������---->�ַ���
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);  //2024/4/8 ����12:11

        //�������ַ���--->����
        //ParseException�����쳣���������ַ���������SimpleDateFormat����ʶ��ĸ�ʽ
        //Date date3 = sdf.parse("2024/4/8 ����12:11");
        Date date2 = sdf.parse("2024-12-05 14:27:12");
        System.out.println(date2);  //Mon Apr 08 12:11:00 CST 2024

    }


    /*
     * Calendar:������
     * �� ʵ���� ����Calendar��һ�������࣬����������Ҫ�����������ʵ������������ͨ��Calendar�ľ�̬����
     *          getInstance()���ɻ�ȡ
     *
     * �ڳ��÷�����get(int field) / set(int field,xx) / add(int field,xx) / getTime() / setTime()
     * */

    @Test
    public void test4() {
        //ֱ�ӵ��ó�����Calendar�ľ�̬����getInstance()
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        //���Է���
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


    //jdk8���ʱ����
    /*
    * - �ɱ��ԣ������ں�ʱ����������Ӧ���ǲ��ɱ�ġ�
     - ƫ���ԣ�Date�е�����Ǵ�1900��ʼ�ģ����·ݶ���0��ʼ��
     - ��ʽ������ʽ��ֻ��Date���ã�Calendar���С�
     - ���⣬����Ҳ�����̰߳�ȫ�ģ����ܴ�������ȡ�
    *
    * */
    @Test
    public void test5() {
        String s1 = "hello";
        String s2 = s1.replace('l', 'w'); //String�Ĳ��ɱ���
        System.out.println(s1);  //hello
        //���Calendar�Ŀɱ���
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 23); //��ʼ��8
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); //23
    }

    @Test
    public void test6() {
        //ƫ���ԣ�Date�е�����Ǵ�1900��ʼ�ģ����·ݶ���0��ʼ��
        Date date = new Date(2024, 4, 8);
        System.out.println(date);
        //Thu May 08 00:00:00 CST 3924
        //3924 = 1900 + 2024 May = April + 1
    }


    /*
     * JDK8��api:LocalDate \ LocalTime \ LocalDateTime
     * */
    @Test
    public void test7() {
        //now():��ȡ��ǰ���ں�ʱ���Ӧ��ʵ��
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate); //2024-04-08
        System.out.println(localTime);//17:30:50.199698200
        System.out.println(localDateTime);//2024-04-08T17:30:50.199698200


    }
}


