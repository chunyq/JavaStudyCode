package com.teacher.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //使用元素的自然顺序对元素进行排序,唯一
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);
        ts.add(18);
        ts.add(24);
        for (Integer i : ts) {
            System.out.println(i);
        }
        System.out.println("=====");
        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("jack");
        ts2.add("for");
        ts2.add("rose");
        ts2.add("do");
        ts2.add("abstract");
        ts2.add("jack");
        ts2.add("break");
        ts2.add("if");
        ts2.add("for");

        for (String s : ts2) {
            System.out.println(s);

        }
    }
}