package com.yh;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set集合概述
 * java.util.Set接口和java.util.List接口一样，同样继承自Collection接口，
 * 它与Collection接口中的方法基本一致，并没有对Collection接口进行功能上的扩充，
 * 只是比Collection接口更加严格了。
 * 与List接口不同的是，Set接口中元素无序，并且都会以某种规则保证存入的元素不出现重复。
 * <p>
 * Set集合有多个子类，这里我们介绍其中的java.util.HashSet、java.util.LinkedHashSet这两个集合。
 * Set集合的特点
 * <p>
 * - Set集合中的元素不可重复
 * - Set集合没有索引
 * 总结： 无序，唯一
 * <p>
 * HashSet集合
 * java.util.HashSet是Set接口的一个实现类，它所存储的元素是不可重复的，并且元素都是无序的(即存取顺序不一致)。
 * java.util.HashSet底层的实现其实是一个java.util.HashMap支持，由于我们暂时还未学习，先做了解。
 * HashSet是根据对象的哈希值来确定元素在集合中的存储位置，因此具有良好的存取和查找性能。
 * 保证元素唯一性的方式依赖于：hashCode与equals方法。
 * <p>
 * HashSet集合的特点
 * <p>
 * - HashSet集合中的元素不可重复
 * - HashSet集合没有索引
 * - HashSet集合是无序的(存储元素的顺序与取出元素顺序可能不一致)
 * 总结：无序，唯一
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet();

        boolean b = set.add("xxx");
        set.add("yyy");
        boolean x = set.add("xxx");
        set.add("zzz");
        set.add("hhh");

        System.out.println(b);  //true
        System.out.println(x);  //false
        System.out.println(set);
        System.out.println("=====");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String s : set) {
            System.out.println(s);
        }
        set.forEach(System.out::println);


    }
}
