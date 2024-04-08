package exam.exer1;

import java.util.Scanner;

/**
 * ClassName:Test
 * Package:exam.exer1
 *
 * @Author 86183
 * @Create 2024/4/7 15:35
 */
public class Test {
    public static void main(String[] args) {
        SalariedEmlpoyee se1 = new SalariedEmlpoyee("张三", 12, 10000);
        HourlyEmployee he1 = new HourlyEmployee("李四", 4, 30, 170);

        //获取工资
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        double se1Salary = se1.getSalary(month);
        double he1Salary = he1.getSalary(month);

        System.out.println(month + "月" + se1.getName() + "发了" + se1Salary + "元");
        System.out.println(month + "月" + he1.getName() + "发了" + he1Salary + "元");

        System.out.println();
        //输出工资更高的员工信息
        System.out.println("工资更高的员工信息");
        if (se1Salary > he1Salary) {
            System.out.println(se1.toString());
        } else {
            System.out.println(he1.toString());
        }


    }
}
