package com.yh1_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName:ListDemo
 * Package:com.yh1_list
 *
 * @Author 86183
 * @Create 2024/4/10 10:13
 */
public class ListDemo {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //实现类向上转型为接口类型
        //继承了Collection接口中的全部方法，
        //而且还增加了一些根据元素索引来操作集合的特有方法
        List<String> list = new ArrayList<>();

        //增 add(int index, E element)
        list.add(0, "yang");
        list.add("zhu");
        list.add(0, "ma");
        list.add(1, "xuzongyan");

        System.out.println("list长度为" + list.size());
        System.out.println(list);

        //删 remove(int index)
        System.out.println(list.remove(0));//xuzongyan
        System.out.println(list);

        //改 set(int index, E element)
        System.out.println(list.set(0, "yang")); //ma
        System.out.println(list);

        //查 get(int index)
        System.out.println(list.get(list.size() - 1)); //index!=list.size()


        //遍历
        //1、迭代器Iterator
        System.out.println("===========");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //2、for-each增强循环或lambda表达式
        System.out.println("===========");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=====");
        list.forEach(System.out::println);

        //3、for+get方法
        System.out.println("===list独有的遍历===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
