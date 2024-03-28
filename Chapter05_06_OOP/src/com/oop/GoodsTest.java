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
        Goods g = new Goods("遥控车","限量版","21443294");
        System.out.println("玩具名称："+g.getName()+"\n"+"信息："+g.getInfo());
        String a = new Goods().getName();
    }
}
