package com.basic;

/**
 * ClassName:JieCheng
 * Package:com.basic
 *
 * @Author 86183
 * @Create 2024/3/30 9:06
 */
//输出1-10的阶乘，并计算阶乘之和
public class JieCheng {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int f = 1;
            for (int j = 1; j <= i; j++) {
                f *= j;
            }
            System.out.println(i + "的阶乘是" + f);
            sum += f;
        }
        System.out.println("阶乘之和为：" + sum);


    }
}
