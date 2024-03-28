package com.homework;

/**
 * ClassName:HourEmployee
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:57
 */
/*
定义一个小时工类HourEmployee,继承Employee类,
定义属性
hSalary：时薪
hours:时长
重写:getMoney(),
输出：    张三的基本工资是：5000元。
时薪80元，时长20小时，小时工资：1600；
本月总工资6600

定义自己特有的方法: eat(),输出"我喜欢吃红烧肉"
 */
public class HourEmployee extends Employee {
    //属性
    private int hSalary; //时薪
    private int hours; //时长

    //继承父类构造方法
    public HourEmployee() {
        super();
    }

    public HourEmployee(String name, double salary, int hSalary, int hours) {
        super(name, salary);
        this.hSalary = hSalary;
        this.hours = hours;
    }

    public int gethSalary() {
        return hSalary;
    }

    public void sethSalary(int hSalary) {
        this.hSalary = hSalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //重写getMoney()
    public double getMoney() {
        System.out.println(name + "的基本工资是：" + salary + "元");
        System.out.println("时薪" + hSalary + "元，时长" + hours + "小时，小时工资：" + hSalary * hours);

        return salary + hSalary * hours;
    }

    //特有方法
    public void eat() {
        System.out.println("我喜欢吃红烧肉");
    }
}
