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
        SalariedEmlpoyee se1 = new SalariedEmlpoyee("����", 12, 10000);
        HourlyEmployee he1 = new HourlyEmployee("����", 4, 30, 170);

        //��ȡ����
        Scanner sc = new Scanner(System.in);
        System.out.print("�������·ݣ�");
        int month = sc.nextInt();
        double se1Salary = se1.getSalary(month);
        double he1Salary = he1.getSalary(month);

        System.out.println(month + "��" + se1.getName() + "����" + se1Salary + "Ԫ");
        System.out.println(month + "��" + he1.getName() + "����" + he1Salary + "Ԫ");

        System.out.println();
        //������ʸ��ߵ�Ա����Ϣ
        System.out.println("���ʸ��ߵ�Ա����Ϣ");
        if (se1Salary > he1Salary) {
            System.out.println(se1.toString());
        } else {
            System.out.println(he1.toString());
        }


    }
}
