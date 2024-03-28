package com.homework;

/**
 * ClassName:Coder
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:20
 */
public class Coder {
    private String name;
    private String id; //工号
    private double salary; //工资

    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //成员方法

    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"的程序员"+name+"正在努力的写着代码......");
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
}
