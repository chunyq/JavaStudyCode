package com.oop;

/**
 * ClassName:GoodsTest
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/28 14:23
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods g = new Goods("ң�س�","������","21443294");
        System.out.println("������ƣ�"+g.getName()+"\n"+"��Ϣ��"+g.getInfo());
        String a = new Goods().getName();
    }
}
