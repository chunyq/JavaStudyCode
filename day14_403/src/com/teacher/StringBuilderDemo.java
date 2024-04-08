package com.yh.api;

/**
 * StringBuilder是一个可变的字符串类，我们可以把它看成是一个容器，
 * 这里的可变指的是 StringBuilder对象中的内容是可变的，也可称之为字符串缓冲类。
 * <p>
 * 2.构造方法：
 * public StringBuilder()     创建一个空白可变字符串对象，不含有任何内容 16
 * public StringBuilder(String str)   根据字符串的内容，来创建可变字符串对象，容量=字符串长度+16
 * 3.StringBuilder的添加功能：
 * public StringBuilder append(String str):可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
 * public StringBuilder insert(int offset,String str):在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
 * <p>
 * 4.StringBuilder的删除功能
 * public StringBuilder deleteCharAt(int index):删除指定位置的字符，并返回本身
 * public StringBuilder delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        //StringBuilder s = new StringBuilder(16);//初始容量16
        StringBuilder s = new StringBuilder("abc123");  //6+16

        System.out.println(s.capacity());
        //s.length()
        //s.charAt()
        //s.indexOf()
        StringBuilder xyz = s.append("xyz");
        System.out.println(xyz);
        System.out.println(s);
        System.out.println(s.capacity());

        //System.out.println(s.insert(0, "##"));//插入到头部 0
        System.out.println(s.insert(3, "##"));
        System.out.println(s.length());//11

        System.out.println(s.insert(11, "##"));//插入到尾部 索引为：length()
        System.out.println(s);
        System.out.println(s.length());

        //    删除

    }
}
