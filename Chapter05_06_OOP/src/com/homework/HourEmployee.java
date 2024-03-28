package com.homework;

/**
 * ClassName:HourEmployee
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:57
 */
/*
����һ��Сʱ����HourEmployee,�̳�Employee��,
��������
hSalary��ʱн
hours:ʱ��
��д:getMoney(),
�����    �����Ļ��������ǣ�5000Ԫ��
ʱн80Ԫ��ʱ��20Сʱ��Сʱ���ʣ�1600��
�����ܹ���6600

�����Լ����еķ���: eat(),���"��ϲ���Ժ�����"
 */
public class HourEmployee extends Employee {
    //����
    private int hSalary; //ʱн
    private int hours; //ʱ��

    //�̳и��๹�췽��
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

    //��дgetMoney()
    public double getMoney() {
        System.out.println(name + "�Ļ��������ǣ�" + salary + "Ԫ");
        System.out.println("ʱн" + hSalary + "Ԫ��ʱ��" + hours + "Сʱ��Сʱ���ʣ�" + hSalary * hours);

        return salary + hSalary * hours;
    }

    //���з���
    public void eat() {
        System.out.println("��ϲ���Ժ�����");
    }
}
