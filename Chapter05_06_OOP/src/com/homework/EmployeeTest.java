package com.homework;

/**
 * ClassName:EmployeeTest
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 20:15
 */
/*
�ڲ������ж���ʵ�����¹���:
    ʹ��Ĭ�ϵĹ��췽���ֱ𴴽�Сʱ���� ������Ա����Ķ��󣬲�Ϊ����ֵ
    ���÷����������з���
 */
public class EmployeeTest {
    public static void main(String[] args) {
        HourEmployee hourEmployee = new HourEmployee("����",5000,80,20);
        SalaryEmployee salaryEmployee = new SalaryEmployee("����",5000,60000,0.1);
        double hSalary = hourEmployee.getMoney();
        System.out.println("�����ܹ���" + hSalary);
        hourEmployee.eat();
        double sSalary = salaryEmployee.getMoney();
        System.out.println("�����ܹ���" + sSalary);
        salaryEmployee.play();

    }
}
