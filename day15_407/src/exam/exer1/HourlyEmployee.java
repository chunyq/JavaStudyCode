package exam.exer1;

/**
 * ClassName:HourlyEmployee
 * Package:exam.exer1
 *
 * @Author 86183
 * @Create 2024/4/7 15:26
 */
public class HourlyEmployee extends Employee {
    private double hSalary; //ÿСʱ�Ĺ���
    private int h; //ÿ�¹�����Сʱ��

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int month, double hSalary, int h) {
        super(name, month);
        this.hSalary = hSalary;
        this.h = h;
    }

    public double gethSalary() {
        return hSalary;
    }

    public void sethSalary(double hSalary) {
        this.hSalary = hSalary;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    //����

    @Override
    public double getSalary(int month) {
        double salary = h > 160 ? super.getSalary(month) + (160 * hSalary) + (h - 160) * 1.5 * hSalary
                : super.getSalary(month) + (h * hSalary);
        return salary;
    }

    @Override
    public String toString() {
        return "Сʱ��{" +
                "������" + super.getName() +
                ",�����·ݣ�" + super.getMonth() +
                ",ÿСʱ���ʣ�" + hSalary +
                ",Сʱ��=" + h +
                '}';
    }
}
