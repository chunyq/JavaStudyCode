package com.oop.exer1;

/**
 * ClassName:Phone
 * Package:com.oop.exer1
 *
 * @Author 86183
 * @Create 2024/3/30 9:56
 */
public class Phone {
    String brand; //�ֻ�Ʒ��
    long phoneNum; //�ֻ���

    public Phone() {
    }

    public Phone(String brand, long phoneNum) {
        this.brand = brand;
        this.phoneNum = phoneNum;
    }

    public void call() {
        System.out.println("ʹ��" + brand + "�ֻ����ֻ���" + phoneNum + "��绰");
    }

    //����Ϣ
    public void message(){
        System.out.println("�ڸ�"+phoneNum+"����Ϣ");
    }

}
