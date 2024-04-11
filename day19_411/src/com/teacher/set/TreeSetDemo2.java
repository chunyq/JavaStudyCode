package com.teacher.set;


import java.util.TreeSet;

/**
 * 1. TreeSet:唯一 自然排序
 * <p>
 * 2.对自定义对象实现排序:
 * 方式一:
 * 要排序的实体类 实现 Comparable<T> 接口
 * 重写排序规则  public int compareTo(Employee o)
 * 方式二:
 * 实体类不改动
 * 自定义比较器,实现比较器接口: Comparator<Employee>
 * 重新比较器方法
 * 在创建Treeset时,构造器中传递比较器: TreeSet<>(Comparator c)
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {

        Employee e1 = new Employee("jack", 21, 9000.0);
        Employee e2 = new Employee("tom", 21, 9000.0);
        Employee e22 = new Employee("joker", 21, 9000.0);
        Employee e23 = new Employee("ccc", 21, 9000.0);
        Employee e24 = new Employee("aaa", 21, 9000.0);
        Employee e3 = new Employee("adivd", 21, 12000.0);
        Employee e4 = new Employee("monica", 27, 9000.0);
        Employee e5 = new Employee("rose", 21, 15000.0);
        Employee e6 = new Employee("bobo", 29, 9000.0);

        TreeSet<Employee> set = new TreeSet<>();
        set.add(e1);
        set.add(e3);
        set.add(e4);
        set.add(e2);
        set.add(e22);
        set.add(e23);
        set.add(e24);
        set.add(e5);
        set.add(e6);
        System.out.println(set.size());
        for (Employee employee : set) {
            System.out.println(employee);
        }


    }
}
