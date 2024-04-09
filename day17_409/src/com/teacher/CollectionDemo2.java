package com.teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection:
 * 1.概述
 * Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。
 * <p>
 * 2.Collection常用方法
 * 方法名                         	说明
 * public boolean add(E e)     	把给定的对象e添加到当前集合中 。E:element 元素
 * public boolean remove(E e)  	把给定的对象在当前集合中删除e。
 * public boolean contains(E e)	判断当前集合中是否包含给定的对象e。
 * public boolean isEmpty()    	判断当前集合是否为空。
 * public int size()           	返回集合中元素的个数。
 * public Object[] toArray()   	把集合中的元素，存储到数组中。
 * public void clear()         	清空集合中所有的元素。
 * 3.
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        //创建实现类对象向上转型为接口类型
        Collection<Integer> c = new ArrayList();
        c.add(111);
        //c.add(new Integer(222));
        c.add(333);
        c.add(333);
        c.add(444);
        System.out.println(c);
        //获取迭代器对象
        //用来遍历集合中的元素
        Iterator<Integer> iterator = c.iterator();
        while (iterator.hasNext()) {//判断指针后是否有下一个元素
            //Integer e = iterator.next();
            //System.out.println(e);
            System.out.println(iterator.next());//获取元素
        }
        System.out.println("=====foreach===");
        //目标只能是Collection或者是数组。新式for仅仅作为遍历操作出现。
        for (Integer k : c) {
            System.out.println(k);
        }
        String[] s = {"xxx", "yyy", "zzz"};
        for (String e : s) {
            System.out.println(e);
        }
        System.out.println("==扩展====");
        Arrays.stream(s).forEach(System.out::println);

        System.out.println("=====函数式编程 方法引用===");
        c.forEach(System.out::println);

    }
}
