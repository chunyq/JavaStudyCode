package com.homework;

/**
 * ClassName:Manager
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:20
 */
/*
1.按照以上要求定义Manager类和Coder类,生成空参、有参构造
2.定义测试类,在main方法中创建每个类的对象并给属性赋值
3.调用每个对象的成员方法,打印格式如下:
工号为123基本工资为15000奖金为6000的项目经理周扒皮正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
工号为135基本工资为10000的程序员杨白劳正在努力的写着代码......
 */
public class Manager {
    private String name;
    private String id; //工号
    private double salary; //工资
    private double bonus; //奖金

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }


    //成员方法
    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "奖金为" + bonus + "的项目经理" + name + "正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
