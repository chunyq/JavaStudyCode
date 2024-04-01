package com.yh01_permission_modifier.exer1;

/**
 * ClassName:Test
 * Package:com.yh01_permission_modifier.exer1
 *
 * @Author 86183
 * @Create 2024/4/1 16:17
 */
//同一个包中无关类 --> public protected default
public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        father.test1();
        father.test2();
        father.test3();
    }

}
