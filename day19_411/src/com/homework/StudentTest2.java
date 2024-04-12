package com.homework;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * ClassName:StudentTest2
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/11 18:14
 */
public class StudentTest2 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //o1-o2表示升序，o2-o1表示降序
                //年龄
                int num1 = o2.getAge() - o1.getAge();
                //姓名长度
                int num2 = num1 == 0 ? o1.getName().length() - o2.getName().length() : num1;
                //姓名内容
                int num3 = num2 == 0 ? o1.getName().compareTo(o2.getName()) : num2;
                return num3;
            }
        });

        treeSet.add(new Student("zhu", 21));
        treeSet.add(new Student("yang", 21));
        treeSet.add(new Student("ma", 21));
        treeSet.add(new Student("xu", 23));
        treeSet.add(new Student("jack", 23));

        System.out.println("排序规则：先排年龄(降序)，再排姓名长度(升序)，最后排姓名内容(升序)");
        for (Student s : treeSet) {
            System.out.println(s);
        }


    }
}
