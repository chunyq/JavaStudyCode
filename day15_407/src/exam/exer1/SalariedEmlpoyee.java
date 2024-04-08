package exam.exer1;

/**
 * ClassName:SalariedEmlpoyee
 * Package:exam.exer1
 *
 * @Author 86183
 * @Create 2024/4/7 15:21
 */
public class SalariedEmlpoyee extends Employee {
    private double mSalary; //��н

    public SalariedEmlpoyee() {
    }

    public SalariedEmlpoyee(String name, int month, double mSalary) {
        super(name, month);
        this.mSalary = mSalary;
    }

    public double getmSalary() {
        return mSalary;
    }

    public void setmSalary(double mSalary) {
        this.mSalary = mSalary;
    }

    @Override
    public double getSalary(int month) {
        double salary = super.getSalary(month) + mSalary;
        return salary;
    }

    @Override
    public String toString() {
        return "�̶�����{" +
                "������" + super.getName() +
                ",�����·ݣ�" + super.getMonth() +
                ",�̶����ʣ�" + mSalary +
                '}';
    }
}
