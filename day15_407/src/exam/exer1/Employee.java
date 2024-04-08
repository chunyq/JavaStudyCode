package exam.exer1;

/**
 * ClassName:Employee
 * Package:exam.exer1
 *
 * @Author 86183
 * @Create 2024/4/7 15:13
 */
public class Employee {
    private String name; //员工姓名
    private int month; //员工生日月份


    //构造器
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

    //方法
    public double getSalary(int month) {
        //奖励工资
        double salary = this.month == month ? 100 : 0;
        return salary;
    }
}
