package com.homework;

/**
 * ClassName:Employee
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:47
 */
/*
定义一个父类Employee(员工),包含:
属性：
    姓名name
    工资salary
方法：
    double getMoney():张三的基本工资是：5000元,并返回工资
    void work():做大做强！再创辉煌！
 */
public class Employee {
    //成员属性 作为父类 修饰符应为公有public
    public String name;
    public double salary; //工资

    //构造方法
    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //成员方法
    public double getMoney() {
        System.out.println(name + "的基本工资是：" + salary + "元");
        return salary;
    }

    public void work() {
        System.out.println("做大做强！再创辉煌！");
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

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
