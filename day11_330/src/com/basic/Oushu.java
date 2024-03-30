package com.basic;

/**
 * ClassName:Oushu
 * Package:com.basic
 *
 * @Author 86183
 * @Create 2024/3/30 8:56
 */
//输出1-100间的偶数
public class Oushu {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println("偶数："+i);
            }
        }
    }
}
