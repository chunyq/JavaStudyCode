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
        //�������϶���
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //o1-o2��ʾ����o2-o1��ʾ����
                //����
                int num1 = o2.getAge() - o1.getAge();
                //��������
                int num2 = num1 == 0 ? o1.getName().length() - o2.getName().length() : num1;
                //��������
                int num3 = num2 == 0 ? o1.getName().compareTo(o2.getName()) : num2;
                return num3;
            }
        });

        treeSet.add(new Student("zhu", 21));
        treeSet.add(new Student("yang", 21));
        treeSet.add(new Student("ma", 21));
        treeSet.add(new Student("xu", 23));
        treeSet.add(new Student("jack", 23));

        System.out.println("���������������(����)��������������(����)���������������(����)");
        for (Student s : treeSet) {
            System.out.println(s);
        }


    }
}
