package com.homework;

/**
 * ClassName:SalaryEmployee
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 20:08
 */
/*
��������
e�����۶�
tc:�����
��д:getMoney(),
�����    �����Ļ��������ǣ�5000Ԫ��
���۶�60000Ԫ�����0.1��������ɣ�6000��
�����ܹ���11000
�����Լ����еķ���: play(),���"��ϲ����궷��"
 */
public class SalaryEmployee extends Employee {
    //����
    private int e; //���۶�
    private double tc; //�����

    //�̳и��๹�췽��
    public SalaryEmployee() {
        super();
    }

    public SalaryEmployee(String name, double salary, int e, double tc) {
        super(name, salary);
        this.e = e;
        this.tc = tc;
    }

    //��Ա����

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public double getTc() {
        return tc;
    }

    public void setTc(double tc) {
        this.tc = tc;
    }

    //��дgetMoney()
    public double getMoney() {
        System.out.println(name + "�Ļ��������ǣ�" + salary + "Ԫ");
        System.out.println("���۶�" + e + "Ԫ�����" + tc + "��������ɣ�" + e * tc + "Ԫ");

        return salary + e * tc;
    }
    //���еķ���
    public void play(){
        System.out.println("��ϲ����궷��");
    }
}
