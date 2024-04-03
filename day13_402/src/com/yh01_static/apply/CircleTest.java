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

        //静态变量直接通过类访问,也称类变量
        System.out.println(Circle.total);
        //类方法
        Circle.changDu(4);

    }
}

class Circle {
    double radius; //实例变量

    static final double PI = 3.14;
    int id; //编号

    static int total; //静态变量，Circle实例个数

    private static int init = 1001; //自动给id赋值的基数

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
