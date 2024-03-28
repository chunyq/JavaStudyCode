package com.homework;

/**
 * ClassName:Acount
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 18:36
 */
/*
账户类
使用无参构造方法创建对象，为变量赋值，调用方法 测试所有功能
    使用有参构造方法创建对象，调用方法 测试所有功能
 */
public class Acount {
    //成员变量
    private long id;  //账户号码
    private int password; //密码
    private String name; //姓名
    private double balance; //账户余额

    //构造方法
    public Acount() {
    }

    public Acount(long id, int password, String name, double balance) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.balance = balance;
    }

    //成员方法

    //查询
    public void getInfo() {
        System.out.println(name + "账号为" + id + "的银行卡余额为" + balance + "元");
    }

    //存款
    public void deposit(double cun) {
        balance += cun;
        System.out.println("本次存入" + cun + "元，账户余额为" + balance + "元");
    }

    //取款
    public void withdraw(double qu) {
        if (qu > balance) {
            System.out.println("余额不足");
        } else {
            balance -= qu;
            System.out.println("本次取出" + qu + "元，账户余额为" + balance + "元");
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
