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
        employees.add(new Employee("张三", 21, 4500));
        employees.add(new Employee("老王", 23, 4500));
        employees.add(new Employee("李四", 25, 5000));
        employees.add(new Employee("赵钱孙", 28, 6000));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            //选择器接口方法的重写
            //差值大于0，则o2更大排在前面，o1更小排后面，反之，则o2排后面，o1排前面
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
