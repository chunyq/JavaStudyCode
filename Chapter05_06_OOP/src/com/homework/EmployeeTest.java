package com.homework;

/**
 * ClassName:EmployeeTest
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 20:15
 */
/*
在测试类中定义实现如下功能:
    使用默认的构造方法分别创建小时工类 和销售员工类的对象，并为对象赋值
    调用方法测试所有方法
 */
public class EmployeeTest {
    public static void main(String[] args) {
        HourEmployee hourEmployee = new HourEmployee("张三",5000,80,20);
        SalaryEmployee salaryEmployee = new SalaryEmployee("张三",5000,60000,0.1);
        double hSalary = hourEmployee.getMoney();
        System.out.println("本月总工资" + hSalary);
        hourEmployee.eat();
        double sSalary = salaryEmployee.getMoney();
        System.out.println("本月总工资" + sSalary);
        salaryEmployee.play();

    }
}
