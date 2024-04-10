package com.yh;

import java.util.HashSet;

/**
 * HashSet存储自定义类型元素
 */
public class StudentDemo {
    public static void main(String[] args) {

        HashSet<Student> stuSet = new HashSet<Student>();
        //存储
        stuSet.add(new Student("于谦", 43));
        stuSet.add(new Student("于谦", 43));
        stuSet.add(new Student("郭麒麟", 23));
        stuSet.add(new Student("郭麒麟", 23));

        System.out.println(stuSet.size());
        System.out.println(stuSet);


    }
}
