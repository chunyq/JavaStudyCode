package com.yh01_api_time;

import java.math.BigInteger;

/**
 * ClassName:BigIntegerDemo
 * Package:com.yh01_api
 *
 * @Author 86183
 * @Create 2024/4/8 10:26
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        //�����ݣ���long���󣩷�װΪBigInteger����
        BigInteger big1 = new BigInteger("42353542364324346473463274754");
        BigInteger big2 = new BigInteger("87934795249386489273894738447");
        //�ӷ�
        BigInteger bigAdd = big1.add(big2);
        //����
        BigInteger bigSub = big2.subtract(big1);
        //�˷�
        BigInteger bigMul = big1.multiply(big2);
        //����
        BigInteger bigDiv = big2.divide(big1);

        System.out.println(bigAdd);
        System.out.println(bigSub);
        System.out.println(bigMul);
        System.out.println(bigDiv);
    }
}
