package com.teacher;

import java.util.LinkedList;

/**
 *
 */
public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> link = new LinkedList<String>();
        // 添加元素
        link.add("hello");
        link.add("world");
        link.add("java");

        link.addFirst("xxx");
        link.addLast("yyy");
        System.out.println(link);

        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());

        System.out.println(link);

        link.push("hhh");
        link.push("qqq");
        System.out.println(link);
        //System.out.println( link.pop());
        System.out.println("====");
/*        int l= link.size();
        for (int i = 0; i <l ; i++) {
            System.out.println(l+"-----"+link.pop());
        }*/
        while (!link.isEmpty()) {
            System.out.println(link.pop());
        }
        //System.out.println(link);


    }
}
