package com.yh01_permission_modifier.exer2;

import com.yh01_permission_modifier.exer1.Father;

/**
 * ClassName:Test2
 * Package:com.yh01_permission_modifier.exer2
 *
 * @Author 86183
 * @Create 2024/4/1 16:31
 */
//不同包中无关类 --> public
public class Test2 {
    public static void main(String[] args) {
        Father father = new Father();
        father.test1();
    }
}
