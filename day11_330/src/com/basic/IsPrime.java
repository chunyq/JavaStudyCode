package com.basic;

/**
 * ClassName:IsPrime
 * Package:com.basic
 *
 * @Author 86183
 * @Create 2024/3/30 9:22
 */
//输出1-100所有质数
public class IsPrime {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            //表示可能的因子区间
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                System.out.println("质数："+i);
            }
        }
        System.out.println("1~100所有质数的和："+sum);

    }
}
