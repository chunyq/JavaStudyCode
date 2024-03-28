package com.homework;

/**
 * ClassName:Manager
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:20
 */
/*
1.��������Ҫ����Manager���Coder��,���ɿղΡ��вι���
2.���������,��main�����д���ÿ����Ķ��󲢸����Ը�ֵ
3.����ÿ������ĳ�Ա����,��ӡ��ʽ����:
����Ϊ123��������Ϊ15000����Ϊ6000����Ŀ�����ܰ�Ƥ����Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....
����Ϊ135��������Ϊ10000�ĳ���Ա���������Ŭ����д�Ŵ���......
 */
public class Manager {
    private String name;
    private String id; //����
    private double salary; //����
    private double bonus; //����

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }


    //��Ա����
    public void work() {
        System.out.println("����Ϊ" + id + "��������Ϊ" + salary + "����Ϊ" + bonus + "����Ŀ����" + name + "����Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....");
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
