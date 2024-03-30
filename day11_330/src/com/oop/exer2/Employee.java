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
    private double salary; //��������
    private int month; //�����·�

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

    //���ڼ����µĹ��ʣ�����������������յ��£����ⲹ��500Ԫ
    public double getMoney(int month) {
        int gz = 5000;
        if (month == this.month) {
            System.out.println("�������������յ��£����ⲹ��500Ԫ");
            gz += 500;
            System.out.println(name + "�Ļ��������ǣ�" + gz + "Ԫ");
        } else {
            System.out.println(name + "�Ļ��������ǣ�" + gz + "Ԫ");
        }
        return setSalary(gz);
    }

    public void work() {
        System.out.println("������ǿ���ٴ��Իͣ�");
    }


}
