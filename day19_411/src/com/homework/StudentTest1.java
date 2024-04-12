package com.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName:StudentTest1
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/11 17:15
 */
public class StudentTest1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("zhu", 21));
        list.add(new Student("yang", 21));
        list.add(new Student("ma", 21));
        list.add(new Student("xu", 23));
        list.add(new Student("jack", 23));

        //���併����������
        Collections.sort(list, new Comparator<Student>() {
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

        System.out.println("���������������(����)��������������(����)���������������(����)");
        for (Student student : list) {
            System.out.println(student);
        }

    }
}
