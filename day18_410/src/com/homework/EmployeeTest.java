package com.homework;

import java.util.*;

/**
 * ClassName:EmployeeTest
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/10 18:36
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("javk", 21, 4500));
        employees.add(new Employee("mike", 21, 4500));
        employees.add(new Employee("jack", 23, 4500));
        employees.add(new Employee("����", 25, 5000));
        employees.add(new Employee("��Ǯ��", 28, 6000));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            //ѡ�����ӿڷ�������д
            //��ֵ����0����o2��������ǰ�棬o1��С�ź��棬��֮����o2�ź��棬o1��ǰ��
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() != o2.getSalary()) {
                    return (int) Math.ceil(o2.getSalary() - o1.getSalary());
                } else {
                    if (o1.getAge() != o2.getAge()) {
                        return o2.getAge() - o1.getAge();
                    } else {
                        return o2.getName().compareTo(o1.getName());
                    }
                }
            }
        });


        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
