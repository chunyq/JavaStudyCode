package com.oop;

/**
 * ClassName:CatDogTest
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 19:56
 */
public class CatDogTest {
    public static void main(String[] args) {
        //����ÿ����Ķ��󲢸����Ը�ֵ
        Cat cat = new Cat();
        cat.brand = "��˹è";
        cat.color = "��ɫ";
        Dog dog = new Dog();
        dog.brand = "����";
        dog.color = "��ɫ";
        //���ó�Ա����
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
    }
}
