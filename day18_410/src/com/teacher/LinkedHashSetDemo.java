package com.yh;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet
 * HashSet:唯一  无序
 * <p>
 * HashSet的子类java.util.LinkedHashSet，它是 链表 和 哈希表组合的一个数据存储结构。
 * <p>
 * LinkedHashSet集合的特点
 * - LinkedHashSet集合中的元素不可重复
 * - LinkedHashSet集合没有索引
 * - LinkedHashSet集合是有序的(存储元素的顺序与取出元素顺序一致)
 * 总结： 有序，唯一
 * <p>
 * 测试:
 * 数据存入的顺序和取出的顺序是否: 一致
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("bbb");
        set.add("aaa");
        set.add("abc");
        set.add("bbc");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}