package com.yh01_permission_modifier.exer1;

/**
 * ClassName:Father
 * Package:com.yunhe01_polymorphism.exer1
 *
 * @Author 86183
 * @Create 2024/4/1 15:38
 */
/*
ͬһ������ͬһ���У��ɷ������г�Ա
����Ȩ�����η�����
 */
public class Father {
    public int a;  //public ������ ͬ������ͬ�������Է���
    int b;     //ȱʡ��  ֻ����ͬһ����
    protected int c; //protected �ܱ�����  ����ͬһ����(��������޹���)����ͬ���������з���
    private int d;  //private ˽�е� ֻ����ͬһ���з���

    public void test1() {
        System.out.println("public ������ ͬ������ͬ�������Է���");
    }

    void test2() {
        System.out.println("ȱʡ��  ֻ����ͬһ����");
    }

    protected void test3() {
        System.out.println("protected �ܱ�����  ����ͬһ����(��������޹���)����ͬ���������з���");
    }

    private void test4() {
        System.out.println("private ˽�е� ֻ����ͬһ���з���");
    }


    //��ʼ����
    //ͬһ��
    public static void main(String[] args) {
        Father father = new Father();
        father.a = 0;
        father.b = 0;
        father.c = 0;
        father.d = 0;
        father.test1();
        father.test2();
        father.test3();
        father.test4();
    }
}
