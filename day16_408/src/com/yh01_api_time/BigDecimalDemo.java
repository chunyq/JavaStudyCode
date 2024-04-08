package com.yh01_api_time;

import java.math.BigDecimal;

/**
 * ClassName:BigDecimalDemo
 * Package:com.yh01_api
 *
 * @Author 86183
 * @Create 2024/4/8 10:41
 */
//BigDecimal实现浮点数高精度运算
public class BigDecimalDemo {
    public static void main(String[] args) {
        //大数据封装为BigDecimal对象
        BigDecimal big1 = new BigDecimal("0.09");
        BigDecimal big2 = new BigDecimal("0.01");
        //add实现加法运算
        BigDecimal bigAdd = big1.add(big2);

        BigDecimal big3 = new BigDecimal("1.0");
        BigDecimal big4 = new BigDecimal("0.32");
        //subtract实现减法运算
        BigDecimal bigSub = big3.subtract(big4);

        BigDecimal big5 = new BigDecimal("1.105");
        BigDecimal big6 = new BigDecimal("100");
        //multiply实现乘法运算
        BigDecimal bigMul = big5.multiply(big6);

        /*
        对于浮点数据的除法运算,和整数不同,可能出现无限不循环小数,
        因此需要对所需要的位数进行保留和选择舍入模式
         */
        BigDecimal big7 = new BigDecimal("10.0");
        BigDecimal big8 = new BigDecimal("3.0");
        //BigDecimal bigDiv = big7.divide(big8);
        /*此处会出现ArithmeticException异常，名为算术异常,
        由于10/3是无限循环小数，无法精确表示，报异常，故需要一个重载的
        Divide方法，divide(BigDecimal divisor,int scale,int roundingMode)
        divisor为除数，scale为小数精确位数，roundingMode表示舍入模式
        有三种：
         BigDecimal.ROUND_UP： 进一法
         BigDecimal.ROUND_FLOOR：去尾法
         BigDecimal.ROUND_HALF_UP 四舍五入
         */
        BigDecimal bigDiv1 = big7.divide(big8, 3, BigDecimal.ROUND_UP);
        BigDecimal bigDiv2 = big7.divide(big8, 3, BigDecimal.ROUND_FLOOR);
        BigDecimal bigDiv3 = big7.divide(big8, 3, BigDecimal.ROUND_HALF_UP);


        System.out.println(bigDiv1);
        System.out.println(bigDiv2);
        System.out.println(bigDiv3);


    }
}
