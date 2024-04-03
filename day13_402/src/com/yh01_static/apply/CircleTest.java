package com.yh01_static.apply;

/**
 * ClassName:CircleTest
 * Package:com.yh01_static.apply
 *
 * @Author 86183
 * @Create 2024/4/2 10:58
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        //��̬����ֱ��ͨ�������,Ҳ�������
        System.out.println(Circle.total);
        //�෽��
        Circle.changDu(4);

    }
}

class Circle {
    double radius; //ʵ������

    static final double PI = 3.14;
    int id; //���

    static int total; //��̬������Circleʵ������

    private static int init = 1001; //�Զ���id��ֵ�Ļ���

    public Circle() {
        this.id = init;
        init++;
        total++;
    }

    public static void changDu(double r) {
        System.out.println(2 * PI * r);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
