package com.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        employees.add(new Employee("����", 21, 4500));
        employees.add(new Employee("����", 23, 4500));
        employees.add(new Employee("����", 25, 5000));
        employees.add(new Employee("��Ǯ��", 28, 6000));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            //ѡ�����ӿڷ�������д
            //��ֵ����0����o2��������ǰ�棬o1��С�ź��棬��֮����o2�ź��棬o1��ǰ��
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() != o2.getSalary()) {
                    return (int) (o2.getSalary() - o1.getSalary());
                } else {
                    return o2.getAge() - o1.getAge();
                }
            }
        });


        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
