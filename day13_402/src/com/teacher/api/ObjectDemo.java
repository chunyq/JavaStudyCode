package com.yh.api;

/**
 * Object:
 * 1.概述：
 * java.lang.Object类是Java语言中的根类(超类 基类)，即所有类的父类。
 * 所有对象（包括数组）都继承了这个类的方法。
 * 它的所有方法子类都可以使用。
 * 在对象实例化的时候，最终找的父类就是Object。
 * 如果一个类没有特别指定父类,那么默认则继承自Object类
 * 2.构造方法：
 * public Object()  :子类中super(),最终找的父类就是Object。
 * <p>
 * 3.成员方法：
 * 方法名                                 说明
 * public String toString()               返回该对象的字符串表示:对象的类型+@+内存地址值。
 * public boolean equals(Object obj)      指示其他某个对象是否与此对象“相等”。
 * <p>
 * 4.== 与equals对比：
 * ==：可以比较基本类型的值是否相等，也可以比较对象是否相同；  是运算符，不能被重写
 * equals:只能用来比较引用数据类型的对象是否相同；  重写之前，比较内存地址，重写之后可以比较内容
 */
public class ObjectDemo {

    public static void main(String[] args) {
        // new 构造方法() : new 一个新对象
        Student s = new Student("张三", 21);
        Student s2 = new Student("张三", 21);

        System.out.println(s == s2);//false :比较的都是 地址
        System.out.println(s.equals(s2));//false

        System.out.println("====equals被重写之后====");
        System.out.println(s.equals(s2));//true ：对象的属性值相等

       /* Object obj = new Object();
        Object obj2 = new Object();

        //obj = obj2;
        //obj = null;//NullPointerException 空指针异常

        System.out.println(obj);//地址：java.lang.Object@4554617c
        System.out.println(obj.toString());//地址：java.lang.Object@4554617c

        int a=1,b=1;
        System.out.println( a==b );     //基本类型的值是否相等
        System.out.println( obj == obj2 );  //对象是否相同

        boolean x = obj.equals(obj2);//对象地址是否相等（同一个对象）
        System.out.println(x);

        //向上转型
        Object student = new Student();
        Object s=new String[3];

        Student stu = new Student("张三", 21);
        System.out.println(stu);
        //System.out.println(stu.getName());
        //System.out.println(stu.getAge());

        Student stu2 = new Student("李四", 21);
        System.out.println(stu2);
*/
    }
}
