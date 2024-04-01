package com.yh01_permission_modifier.exer2;

import com.yh01_permission_modifier.exer1.Father;

/**
 * ClassName:Son2
 * Package:com.yh01_permission_modifier.exer2
 *
 * @Author 86183
 * @Create 2024/4/1 16:21
 */
//不同包子类 --> public protected
public class Son2 extends Father {
    public static void main(String[] args) {
        Son2 son2 = new Son2();
        son2.test1();
        son2.test3();
    }
}
