package com.oop;

/**
 * ClassName:Cat
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 15:37
 */
/*
è��Cat
    ����:
    ë����ɫcolor
    Ʒ��brand
    ��Ϊ:
    �Է�eat()
    ץ����catchMouse()
 */
public class Cat {
    //��Ա����/����
    String brand;
    String color;

    //��Ա����(��Ϊ)
    public void eat(){
        System.out.println(color+"��"+brand+"���ڳ���....");
    }
    public void catchMouse(){
        System.out.println(color+"��"+brand+"���ڴ�����....");
    }

}
