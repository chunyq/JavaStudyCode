package com.oop;

/**
 * ClassName:BianLiang
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/28 10:49
 */
public class BianLiang {
    //��Ա����������֮�У�����֮��,�����������η�,���Բ���ʼ������ȱʡֵ(Ĭ��ֵ)
    String name;
    int num = 1;

    public void test1(){
        //�ֲ�����,�ڷ���֮�У�ֻ�����ڸ÷����������ʼ��
        int num = 4;
        System.out.println("�ֲ�����num="+num);
        //������ó�Ա����num,��Ҫ�õ��ؼ���this
        System.out.println("��Ա����num="+this.num);
        //this.num��ʾͨ��������ø���ĳ�Ա����
    }

    public static void main(String[] args) {
        BianLiang b = new BianLiang();
        b.test1();
    }
}
