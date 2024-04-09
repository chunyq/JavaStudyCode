package com.teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        //创建实现类对象向上转型为接口类型
        //泛型
        //Collection<String> c= new ArrayList();
        //c.add("jack");
        //c.add("rose");
        Collection<Integer> c = new ArrayList();
        c.add(111);
        //c.add(new String("222"));
        c.add(333);
        c.add(333);
        c.add(444);
        System.out.println(c);

        System.out.println(c.size());
        System.out.println(c.contains(555));

        //c.remove(333);//移除第一个元素
        //c.clear();
        System.out.println(c.isEmpty());
        System.out.println(c);

        Object[] array = c.toArray();
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));

        System.out.println("===批量操作====");
        Collection<Integer> c2 = new ArrayList<>();
        c2.add(11);
        c2.add(222);
        c2.add(333);
        c2.add(44);
        //c.addAll(c2);
        c.removeAll(c2);
        System.out.println(c);
    }
}
