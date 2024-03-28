package com.homework;

/**
 * ClassName:Acount
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 18:36
 */
/*
�˻���
ʹ���޲ι��췽����������Ϊ������ֵ�����÷��� �������й���
    ʹ���вι��췽���������󣬵��÷��� �������й���
 */
public class Acount {
    //��Ա����
    private long id;  //�˻�����
    private int password; //����
    private String name; //����
    private double balance; //�˻����

    //���췽��
    public Acount() {
    }

    public Acount(long id, int password, String name, double balance) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.balance = balance;
    }

    //��Ա����

    //��ѯ
    public void getInfo() {
        System.out.println(name + "�˺�Ϊ" + id + "�����п����Ϊ" + balance + "Ԫ");
    }

    //���
    public void deposit(double cun) {
        balance += cun;
        System.out.println("���δ���" + cun + "Ԫ���˻����Ϊ" + balance + "Ԫ");
    }

    //ȡ��
    public void withdraw(double qu) {
        if (qu > balance) {
            System.out.println("����");
        } else {
            balance -= qu;
            System.out.println("����ȡ��" + qu + "Ԫ���˻����Ϊ" + balance + "Ԫ");
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
