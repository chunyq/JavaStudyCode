package com.homework;

/**
 * ClassName:Coder
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:20
 */
public class Coder {
    private String name;
    private String id; //����
    private double salary; //����

    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //��Ա����

    public void work(){
        System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"�ĳ���Ա"+name+"����Ŭ����д�Ŵ���......");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
