package com.oop.exer1;

/**
 * ClassName:Account
 * Package:com.oop.exer1
 *
 * @Author 86183
 * @Create 2024/3/30 9:31
 */
public class Account {
    private String bankFa; //发卡银行
    private long id; //账号
    private int password; //密码
    private double balance; //余额


    public Account() {
    }

    public Account(String bankFa, long id, int password, double balance) {
        this.bankFa = bankFa;
        this.id = id;
        this.password = password;
        this.balance = balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public String getBankFa() {
        return bankFa;
    }

    public void setBankFa(String bankFa) {
        this.bankFa = bankFa;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //查询
    public void search(){
        System.out.println("当前余额："+balance);
    }
    //取款
    public void withDraw(int money){
        System.out.println("您正在[取款]");
        if (money > balance) {
            System.out.println("余额不足，请重新设置取款金额");
        } else {
            balance -=money;
            System.out.println("取款成功！");
            search();
        }
    }

    //存款
    public void deposit(int money){
        System.out.println("您正在[存款]");
        if (money>0) {
            balance += money;
        } else {
            System.out.println("存款金额应大于0");
        }
        System.out.println("存款完成");
        System.out.println("当前余额为"+balance+"元");
    }

    //密码校验
    public boolean checkPwd(int pwd){
        boolean flag = false;
        if (pwd == password) {

            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
