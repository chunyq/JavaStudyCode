package com.oop.exer2;

/**
 * ClassName:Tongji
 * Package:com.oop.exer2
 *
 * @Author 86183
 * @Create 2024/3/30 11:30
 */
public class Test {
    public static void main(String[] args) {
        HourEmployee hourEmployee = new HourEmployee();
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        hourEmployee.setName("张三");
        hourEmployee.setMonth(12);
        hourEmployee.setSalary(5000);
        hourEmployee.sethSalary(80);
        hourEmployee.setHours(89);
        hourEmployee.getMoney(hourEmployee.getHours());
        hourEmployee.eat();

        System.out.println();
        salaryEmployee.setName("张三");
        salaryEmployee.setMonth(8);
        salaryEmployee.setSalary(5000);
        salaryEmployee.setTc(0.1);
        salaryEmployee.setE(60000);
        salaryEmployee.getMoney(salaryEmployee.getE());
        salaryEmployee.play();


    }
}
