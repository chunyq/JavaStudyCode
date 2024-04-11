package com.teacher.set;

/**
 * @Author yh
 * @create 9:24
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        //0 相等   >0 升序   <0降序
        double v = o.getSalary() - this.getSalary();
        //薪资相同,比较年龄;如果不同按上一步比较结果进行
        v = v == 0 ? o.getAge() - this.getAge() : v;
        //年龄相同 比较姓名;如果不同,按上一步比较结果进行判定
        v = v == 0 ? this.getName().compareTo(o.getName()) : v;

        return (int) Math.ceil(v);
        //return (int)Math.ceil(this.getSalary()-o.getSalary());//0.4
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
