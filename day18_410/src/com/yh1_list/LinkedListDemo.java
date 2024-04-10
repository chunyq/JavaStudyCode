package com.yh1_list;

import java.util.LinkedList;

/**
 * ClassName:LinkedListDemo
 * Package:com.yh1_list
 *
 * @Author 86183
 * @Create 2024/4/10 10:53
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        //LinkedList不支持通过索引直接访问元素
        //查找元素需要遍历整个链表
        //增
        System.out.println(linkedList.add("yang")); //true
        linkedList.addFirst("zhu"); //方法返回值为void
        linkedList.addLast("xuzongy");
        System.out.println(linkedList);

        //改，同List一样
        //查 特有：getFirst() getLast()
        System.out.println(linkedList.getFirst()); //首
        System.out.println(linkedList.getLast()); //尾

        //

    }
}
