package exam.exer1;

/**
 * ClassName:Employee
 * Package:exam.exer1
 *
 * @Author 86183
 * @Create 2024/4/7 15:13
 */
public class Employee {
    private String name; //Ա������
    private int month; //Ա�������·�


    //������
    public Employee() {
    }

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //����
    public double getSalary(int month) {
        //��������
        double salary = this.month == month ? 100 : 0;
        return salary;
    }
}
