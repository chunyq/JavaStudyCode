package com.yh.api;

import java.math.BigInteger;

/**
 * BigInteger
 * 1.概述：在Java的世界中,超过long型的整数已经不能被称为整数了,它们被封装成BigInteger对象.
 * 在BigInteger类中,实现四则运算都是方法来实现,并不是采用运算符.
 * 2.作用：BigInteger：存储更大的整数类型，实现四则运算
 * 3.构造方法
 * 方法                           	说明
 * public BigInteger(String val)	将字符串的数组封装成BigInteger对象
 * 4.BigInteger类的常用方法
 * 方法                                      	说明
 * public BigInteger add(BigInteger val)   	两个BigInteger进行相加，并返回BigInteger
 * public BigInteger subtract(BigInteger val)	两个BigInteger进行相减，并返回BigInteger
 * public BigInteger multiply(BigInteger val)	两个BigInteger进行相乘，并返回BigInteger
 * public BigInteger divide(BigInteger val)	两个BigInteger进行相除，并返回BigInteger
 */
public class BigIntegerDemo {
    public static void main(String[] args) {

        //int max = 2147483647;
        //long l= 9223372036854774807L;
        //System.out.println(l*1000);
        BigInteger x = new BigInteger("12345678909876543210");
        BigInteger y = new BigInteger("9876543210012345678908");
        BigInteger add = x.add(y);
        System.out.println(add);
        System.out.println(x.subtract(y));
        System.out.println(x.multiply(y));
        System.out.println(y.divide(x));
    }
}
