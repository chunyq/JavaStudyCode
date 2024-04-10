package com.teacher;

import java.util.*;

/**
 * Collections是针对集合操作的工具类
 */
public class CollectionsDemo {
    public static void main(String[] args) {

        //创建集合对象
        List<Integer> list = new ArrayList<Integer>();
        //添加元素
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        //Collections.sort(list);   //升序排列
        Collections.reverse(list);  //反转集合
        System.out.println(list);
        System.out.println(Collections.min(list));//最小值
        System.out.println(Collections.max(list)); //最大值

        List<String> list1 = Arrays.asList("xxx", "hhh", "zzz", "yyy");//元素转集合

        String[] ss = {"xxx", "hhh", "zzz", "yyy"};
        List<String> list2 = Arrays.asList(ss);//数组转集合
        System.out.println(list2);

    }
}
