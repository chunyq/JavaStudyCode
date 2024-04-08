package com.yh.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1.DateFormat类概述
 * <p>
 * java.text.DateFormat 是日期/时间格式化子类的抽象类，我们通过这个类可以帮我们完成日期和文本之间的转换
 * ,也就是可以在Date对象与String对象之间进行来回转换。
 * <p>
 * - 格式化：按照指定的格式，从Date对象转换为String对象。
 * - 解析：按照指定的格式，从String对象转换为Date对象。
 * <p>
 * 2.DateFormat类的构造方法
 * <p>
 * 由于DateFormat为抽象类，不能直接使用，所以需要常用的子类java.text.SimpleDateFormat。
 * 这个类需要一个模式（格式）来指定格式化或解析的标准。
 * <p>
 * public SimpleDateFormat()              	用默认的模式和默认语言环境的日期格式符号构造SimpleDateFormat。
 * public SimpleDateFormat(String pattern)	用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。
 * <p>
 * 参数pattern是一个字符串，代表日期时间的自定义格式。
 * - 常见的格式规则：
 * 标识字母（区分大小写）	含义
 * y          	年
 * M          	月
 * d          	日
 * H          	时
 * m          	分
 * s          	秒
 * 3.常用方法
 * 方法名                             	说明
 * public String format(Date date) 	将Date对象格式化为字符串。
 * public Date parse(String source)	将字符串解析为Date对象。
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        //Date date = new Date();
        //System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss S 一年中的第D天 E");
        String s = sdf.format(new Date());//匿名对象
        System.out.println(s);

        String str = "2024年04月08 10:18:41";
        Date date1 = null;// 编译器异常

        try {
            date1 = sdf.parse(str);
        } catch (ParseException e) {
            System.out.println("无法解析！！");
        }
        System.out.println(date1);

    }
}
