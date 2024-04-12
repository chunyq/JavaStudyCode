package com.teacher.generictype;

import java.util.ArrayList;

/**
 * 泛型:广泛的数据类型,可以表示任意引用数据类型(使用时具体确定一种类型,如果没有指定,默认为Object类型)
 * 泛型是数据类型的一部分，我们将类名与泛型合并一起看做数据类型
 * <p>
 * - 泛型：可以在类或方法中预支地使用未知的类型。
 * tips:一般在创建对象时，将未知的类型确定具体的类型。当没有指定泛型时，默认类型为Object类型。
 * 好处:
 * 1.解决黄色警告问题
 * 2.将运行期可能遇到的问题转移到编译期
 * 3.灵活定义(使用)数据类型
 */

public class GenericTypeDemo {
    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Double> list2 = new ArrayList<Double>();
        list.add("111");
        //list.add(222);
        //list.add(true);
        //list.add('d');
        System.out.println(list);
        for (Object o : list) {
            String s = (String) o;
            System.out.println(s.length());
        }
        for (Double aDouble : list2) {
            System.out.println(aDouble);
        }


    }
}