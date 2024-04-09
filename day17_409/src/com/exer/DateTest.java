package com.exer;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:DateTest
 * Package:com.exer
 *
 * @Author 86183
 * @Create 2024/4/9 14:25
 */
public class DateTest {
    @Test
    public void test1() {
        //日期-->字符串
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date1);
        System.out.println(str);

        //字符串--->日期
        try {
            Date date2 = sdf.parse("2024-4-8 12:11:10");
            System.out.println(date2);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

}
