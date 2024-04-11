package com.teacher.comparator;

import java.util.Comparator;

/**
 * @Author yh
 * @create 11:00
 */
public class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getAge() - o1.getAge();
    }
}
