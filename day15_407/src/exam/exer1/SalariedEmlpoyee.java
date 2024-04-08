package exam.exer1;

/**
 * ClassName:SalariedEmlpoyee
 * Package:exam.exer1
 *
 * @Author 86183
 * @Create 2024/4/7 15:21
 */
public class SalariedEmlpoyee extends Employee {
    private double mSalary; //月薪

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
        return "固定工资{" +
                "姓名：" + super.getName() +
                ",生日月份：" + super.getMonth() +
                ",固定工资：" + mSalary +
                '}';
    }
}
