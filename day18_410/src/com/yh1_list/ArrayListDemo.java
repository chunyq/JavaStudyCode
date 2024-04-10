package com.yh1_list;

import java.util.ArrayList;

/**
 * ClassName:ArrayListDemo
 * Package:com.yh1_list
 *
 * @Author 86183
 * @Create 2024/4/10 10:32
 */
/*
ArrayList作为List的实现类，List、Collection的方法都能用
不过主要还是用自身特有的方法
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("13232");
        arrayList.add(0, "74545");
        arrayList.add("6453");
        System.out.println(arrayList);

        //增删改查的方法同List一样
    }
}
