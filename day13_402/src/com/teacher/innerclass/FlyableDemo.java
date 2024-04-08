package com.teacher.innerclass;

/**
 * @Author yh
 * @create 12:12
 */
//匿名内部类的使用： 接口/抽象类 作为 参数 的场景
interface Flyable {
    void fly();
}

/*
class A implements  Flyable{
    @Override
    public void fly() {
        System.out.println("I Can fly");
    }
}
*/
public class FlyableDemo {
    public static void test01(int i) {
        System.out.println(i);
    }

    //参数是接口/抽象类
    public static void test03(Flyable f) {
        f.fly();
    }

    /*    public static void test03(Animal f){
            f.eat();
        }*/
    public static void main(String[] args) {
        FlyableDemo.test01(11);
        //FlyableDemo.test03(new A());//传递实现类对象/子类对象
        FlyableDemo.test03(new Flyable() {//简化实现类的定义
            @Override
            public void fly() {
                System.out.println("I Can fly");
            }
        });
    }

}
