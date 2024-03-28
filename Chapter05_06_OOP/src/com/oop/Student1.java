package com.oop;

/**
 * ClassName:Student
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 15:22
 */
public class Student1 {
    //��������(��Ա����)����Ϊ(����)
    //����(״̬��Ϣ)��ѧ�š����������䡢�Ա��Ƿ����
    //��Ϊ(����):ѧϰ�����衢�Է�
    //û�и���Ա������ֵʱ������Ĭ��ֵ������ȱʡֵ
    private String num;
    private String name;
    private byte age;
    private char sex;
    private boolean isAdult;

    //�չ��췽��(������)
    public Student1() {
    }

    //�вι��췽��
    //����(new)����ʱ���Գ�ʼ����Ա����
    public Student1(String num, String name, byte age, char sex, boolean isAdult) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.isAdult = isAdult;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public void teach() {
        System.out.println("�ú�ѧϰ");
    }

    public void sing() {
        System.out.println("����");
    }

}
