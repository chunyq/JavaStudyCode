package com.teacher;

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
 * 5.StringBuilder的替换功能：
 * public StringBuilder replace(int start,int end,String str):从start开始到end用str替换
 * <p>
 * 6. StringBuilder的反转功能：
 * public StringBuilder reverse()
 * <p>
 * 7.转换方法
 * public String toString()   将StringBuilder转换为String
 * <p>
 * 8.StringBuilder和String相互转换
 * StringBuilder转换为String
 * public String toString()：通过 toString() 就可以实现把 StringBuilder 转换为 String
 * String转换为StringBuilder
 * public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder
 * <p>
 * 9.String和StringBuilder及StringBuffe区别
 * A: String是内容不可变的，而StringBuffer,StringBuilder都是内容可变的。
 * B: StringBuffer是同步的，数据安全,效率低.方法前关键字synchronized。
 * C: StringBuilder是不同步的,数据不安全,效率高,单线程;
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //StringBuilder s = new StringBuilder("abc12345");  //6+16
        //    删除
        //    System.out.println(s.deleteCharAt(2));
        //    System.out.println(s);//ab12345
        //
        //    System.out.println(s.delete(2, 5));//删除起点到终点前一位的数据
        //    System.out.println(s);

        StringBuilder s = new StringBuilder("abc1a23a45");  //
        System.out.println(s.replace(1, 4, "##"));//替换 起点到终点前一位的数据
        System.out.println(s);

        s = new StringBuilder("abc123");
        //System.out.println(s.reverse());
        System.out.println(s);
        String s1 = s.toString();
        System.out.println(s.toString());//字符串内容

        StringBuilder s2 = new StringBuilder("abc123");
        System.out.println(s == s2);//false
        System.out.println(s.equals(s2));//false 地址


    }
}
