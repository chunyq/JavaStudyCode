package com.yh01_permission_modifier.exer1;

/**
 * ClassName:ArgsDemo
 * Package:com.yunhe01_polymorphism.exer1
 *
 * @Author 86183
 * @Create 2024/4/1 14:58
 */
/*
�����ͷ���ֵ
�����������ͣ�ֱ�Ӵ��ݻ򷵻�
�����������ͣ�
    ��ͨ�ࣺnew ���� --> �ٴ���/����
    �����ࣺnew �������--> �ٴ���/����
    �ӿڣ�new ʵ������� --> �ٴ���/����
 */
public class ArgsDemo {
    public static void main(String[] args) {
        StudentDemo st = new StudentDemo();
        //������ͨ�����
        st.method(new Student());
        //������ͨ��
        Student student = st.getStudent();
        student.study();
    }
}

class Student {
    public void study() {
        System.out.println("�ú�");
    }
}

class StudentDemo {
    //����ͨ�൱��һ������
    public void method(Student student) {
        student.study();
    }

    //����ֵ����Ϊһ����
    public Student getStudent() {
        return new Student();
    }
}




