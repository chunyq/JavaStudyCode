package com.teacher.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author yh
 * @create 10:18
 */
public class TreeSetDemo3 {
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

        //TreeSet<Employee> set = new TreeSet<>(new MyComparator());

        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        //TreeSet<Employee> set = new TreeSet<>();
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
