package com.homework;

/**
 * ClassName:Employee
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:47
 */
/*
����һ������Employee(Ա��),����:
���ԣ�
    ����name
    ����salary
������
    double getMoney():�����Ļ��������ǣ�5000Ԫ,�����ع���
    void work():������ǿ���ٴ��Իͣ�
 */
public class Employee {
    //��Ա���� ��Ϊ���� ���η�ӦΪ����public
    public String name;
    public double salary; //����

    //���췽��
    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //��Ա����
    public double getMoney() {
        System.out.println(name + "�Ļ��������ǣ�" + salary + "Ԫ");
        return salary;
    }

    public void work() {
        System.out.println("������ǿ���ٴ��Իͣ�");
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
