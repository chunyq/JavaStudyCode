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
        int randomNum = rand.nextInt(61) + 20; //nextInt(61)����0��60֮��������������20���Ϊ20��80֮��������
        System.out.println("���ɵ����������: " + randomNum);
    }
}
