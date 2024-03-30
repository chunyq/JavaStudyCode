package com.oop.exer2;

/**
 * ClassName:Employee
 * Package:com.oop.exer2
 *
 * @Author 86183
 * @Create 2024/3/30 10:56
 */
public class Employee {
    private String name;
    private double salary; //基本工资
    private int month; //生日月份

    public Employee() {
    }

    public Employee(String name, double salary, int month) {
        this.name = name;
        this.salary = salary;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //发第几个月的工资：如果该月正好是生日当月，额外补贴500元
    public double getMoney(int month) {
        int gz = 5000;
        if (month == this.month) {
            System.out.println("该月正好是生日当月，额外补贴500元");
            gz += 500;
            System.out.println(name + "的基本工资是：" + gz + "元");
        } else {
            System.out.println(name + "的基本工资是：" + gz + "元");
        }
        return setSalary(gz);
    }

    public void work() {
        System.out.println("做大做强，再创辉煌！");
    }


}
