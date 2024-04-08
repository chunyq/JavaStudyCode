package com.teacher;

/**
 * StringBuffer是一个可变的字符串类，我们可以把它看成是一个容器，
 * 这里的可变指的是 StringBuffer对象中的内容是可变的，也可称之为字符串缓冲类。
 * <p>
 * 2.构造方法：
 * public StringBuffer()     创建一个空白可变字符串对象，不含有任何内容 16
 * public StringBuffer(String str)   根据字符串的内容，来创建可变字符串对象，容量=字符串长度+16
 * 3.StringBuffer的添加功能：
 * public StringBuffer append(String str):可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
 * public StringBuffer insert(int offset,String str):在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
 * <p>
 * 4.StringBuffer的删除功能
 * public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
 * public StringBuffer delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
 * 5.StringBuffer的替换功能：
 * public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
 * <p>
 * 6. StringBuffer的反转功能：
 * public StringBuffer reverse()
 * 7.转换方法
 * public String toString()   将StringBuffer转换为String
 * <p>
 * 8.StringBuffer 和String相互转换
 * StringBuffer 转换为String
 * public String toString()：通过 toString() 就可以实现把StringBuffer  转换为 String
 * String转换为StringBuffer
 * public StringBuffer(String s)：通过构造方法就可以实现把 String 转换为StringBuffer
 */
public class StringBufferDemo {
    public static void main(String[] args) {
    /*    StringBuffer中的方法和StringBuilder,使用方式相同
        String s = "abc1234";
        StringBuffer buffer = new StringBuffer(s);
        //buffer.toString()

        */
        //StringBuffer s = new StringBuffer("abc12345");  //6+16
        //    删除
        //    System.out.println(s.deleteCharAt(2));
        //    System.out.println(s);//ab12345
        //
        //    System.out.println(s.delete(2, 5));//删除起点到终点前一位的数据
        //    System.out.println(s);

        StringBuffer s = new StringBuffer("abc1a23a45");  //
        System.out.println(s.replace(1, 4, "##"));//替换 起点到终点前一位的数据
        System.out.println(s);

        s = new StringBuffer("abc123");
        //System.out.println(s.reverse());
        System.out.println(s);
        String s1 = s.toString();
        System.out.println(s.toString());//字符串内容

        StringBuffer s2 = new StringBuffer("abc123");
        System.out.println(s == s2);//false
        System.out.println(s.equals(s2));//false 地址


    }
}
