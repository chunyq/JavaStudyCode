package com.homework.exer2;

import java.util.Random;

/**
 * ClassName:SuiJiShu
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/4/8 19:41
 */
public class SuiJiShu {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(61) + 20; //nextInt(61)产生0到60之间的随机数，加上20则变为20到80之间的随机数
        System.out.println("生成的随机整数是: " + randomNum);
    }
}
