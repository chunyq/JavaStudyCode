package com.basic;

/**
 * ClassName:JieCheng
 * Package:com.basic
 *
 * @Author 86183
 * @Create 2024/3/30 9:06
 */
//���1-10�Ľ׳ˣ�������׳�֮��
public class JieCheng {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int f = 1;
            for (int j = 1; j <= i; j++) {
                f *= j;
            }
            System.out.println(i + "�Ľ׳���" + f);
            sum += f;
        }
        System.out.println("�׳�֮��Ϊ��" + sum);


    }
}
