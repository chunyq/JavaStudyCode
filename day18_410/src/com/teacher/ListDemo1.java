package com.teacher;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 */
public class ListDemo1 {
    public static void main(String[] args) {

        //List<String> list = new ArrayList();
        ArrayList<String> list = new ArrayList();
        //list.add(111);
        list.add("111");
        list.add("222");
        list.add("444");
        list.add("444");
        list.add(2, "333");

        System.out.println(list);
        list.remove(4);

        System.out.println(list.size());
        System.out.println(list.contains("444"));
        System.out.println(list.get(3));
        System.out.println(list.set(0, "123"));//旧值

        //System.out.println(list.set(4, "555"));
        list.add(4, "555");

        System.out.println(list);

        System.out.println("======");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("======");

        for (String s : list) {
            System.out.println(s);
        }
        //list.forEach(System.out::println);
        System.out.println("===list独有的遍历===");
        for (int i = 0; i < list.size(); i++) {
            String e = list.get(i);
            System.out.println(e);
        }
    }

}
