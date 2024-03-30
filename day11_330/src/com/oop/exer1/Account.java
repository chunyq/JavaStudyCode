package com.oop.exer1;

/**
 * ClassName:Account
 * Package:com.oop.exer1
 *
 * @Author 86183
 * @Create 2024/3/30 9:31
 */
public class Account {
    private String bankFa; //��������
    private long id; //�˺�
    private int password; //����
    private double balance; //���


    public Account() {
    }

    public Account(String bankFa, long id, int password, double balance) {
        this.bankFa = bankFa;
        this.id = id;
        this.password = password;
        this.balance = balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public String getBankFa() {
        return bankFa;
    }

    public void setBankFa(String bankFa) {
        this.bankFa = bankFa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //��ѯ
    public void search(){
        System.out.println("��ǰ��"+balance);
    }
    //ȡ��
    public void withDraw(int money){
        System.out.println("������[ȡ��]");
        if (money > balance) {
            System.out.println("���㣬����������ȡ����");
        } else {
            balance -=money;
            System.out.println("ȡ��ɹ���");
            search();
        }
    }

    //���
    public void deposit(int money){
        System.out.println("������[���]");
        if (money>0) {
            balance += money;
        } else {
            System.out.println("�����Ӧ����0");
        }
        System.out.println("������");
        System.out.println("��ǰ���Ϊ"+balance+"Ԫ");
    }

    //����У��
    public boolean checkPwd(int pwd){
        boolean flag = false;
        if (pwd == password) {

            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
