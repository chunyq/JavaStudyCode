package com.yh01_api_time;

import java.math.BigDecimal;

/**
 * ClassName:BigDecimalDemo
 * Package:com.yh01_api
 *
 * @Author 86183
 * @Create 2024/4/8 10:41
 */
//BigDecimalʵ�ָ������߾�������
public class BigDecimalDemo {
    public static void main(String[] args) {
        //�����ݷ�װΪBigDecimal����
        BigDecimal big1 = new BigDecimal("0.09");
        BigDecimal big2 = new BigDecimal("0.01");
        //addʵ�ּӷ�����
        BigDecimal bigAdd = big1.add(big2);

        BigDecimal big3 = new BigDecimal("1.0");
        BigDecimal big4 = new BigDecimal("0.32");
        //subtractʵ�ּ�������
        BigDecimal bigSub = big3.subtract(big4);

        BigDecimal big5 = new BigDecimal("1.105");
        BigDecimal big6 = new BigDecimal("100");
        //multiplyʵ�ֳ˷�����
        BigDecimal bigMul = big5.multiply(big6);

        /*
        ���ڸ������ݵĳ�������,��������ͬ,���ܳ������޲�ѭ��С��,
        �����Ҫ������Ҫ��λ�����б�����ѡ������ģʽ
         */
        BigDecimal big7 = new BigDecimal("10.0");
        BigDecimal big8 = new BigDecimal("3.0");
        //BigDecimal bigDiv = big7.divide(big8);
        /*�˴������ArithmeticException�쳣����Ϊ�����쳣,
        ����10/3������ѭ��С�����޷���ȷ��ʾ�����쳣������Ҫһ�����ص�
        Divide������divide(BigDecimal divisor,int scale,int roundingMode)
        divisorΪ������scaleΪС����ȷλ����roundingMode��ʾ����ģʽ
        �����֣�
         BigDecimal.ROUND_UP�� ��һ��
         BigDecimal.ROUND_FLOOR��ȥβ��
         BigDecimal.ROUND_HALF_UP ��������
         */
        BigDecimal bigDiv1 = big7.divide(big8, 3, BigDecimal.ROUND_UP);
        BigDecimal bigDiv2 = big7.divide(big8, 3, BigDecimal.ROUND_FLOOR);
        BigDecimal bigDiv3 = big7.divide(big8, 3, BigDecimal.ROUND_HALF_UP);


        System.out.println(bigDiv1);
        System.out.println(bigDiv2);
        System.out.println(bigDiv3);


    }
}
