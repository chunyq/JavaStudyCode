package com.teacher;

import java.util.Vector;

/**
 * Vector：
 * vector是list的实现类，list中所有方法vector都可以使用，
 * 这里就介绍vector特有方法
 * 1：添加功能
 * public void addElement(Object obj)		--	add()
 * 2：获取功能
 * public Object elementAt(int index)		--  get()
 */
public class VectorDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Vector v = new Vector();
        // 添加功能
        v.add("hello");
        v.add("world");
        v.add("java");
        //添加元素
        v.addElement("xxx");
        v.addElement("yyy");
        v.addElement("zzz");
        System.out.println(v);

        // 遍历
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }
    }
}