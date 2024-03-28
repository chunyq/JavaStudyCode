package com.homework;

/**
 * ClassName:SalaryEmployee
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 20:08
 */
/*
定义属性
e：销售额
tc:提成率
重写:getMoney(),
输出：    张三的基本工资是：5000元。
销售额60000元，提成0.1，销售提成：6000；
本月总工资11000
定义自己特有的方法: play(),输出"我喜欢玩魂斗罗"
 */
public class SalaryEmployee extends Employee {
    //属性
    private int e; //销售额
    private double tc; //提成率

    //继承父类构造方法
    public SalaryEmployee() {
        super();
    }

    public SalaryEmployee(String name, double salary, int e, double tc) {
        super(name, salary);
        this.e = e;
        this.tc = tc;
    }

    //成员方法

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public double getTc() {
        return tc;
    }

    public void setTc(double tc) {
        this.tc = tc;
    }

    //重写getMoney()
    public double getMoney() {
        System.out.println(name + "的基本工资是：" + salary + "元");
        System.out.println("销售额" + e + "元，提成" + tc + "，销售提成：" + e * tc + "元");

        return salary + e * tc;
    }
    //特有的方法
    public void play(){
        System.out.println("我喜欢玩魂斗罗");
    }
}
