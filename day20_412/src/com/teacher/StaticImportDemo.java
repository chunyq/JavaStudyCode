package com.yh;

/**
 * 静态导入的注意事项：
 * A:方法必须是静态的
 * B:如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。
 * 由此可见，意义不大，所以一般不用，但是要能看懂。
 */

import static java.lang.Math.round;
import static java.lang.Math.ceil;

public class StaticImportDemo {
    public static void main(String[] args) {

        //System.out.println( Math.round(12.6));//推荐
        System.out.println(round(12.8));
        System.out.println(ceil(12.8));
        System.out.println(ceil(12.8));
        System.out.println(ceil(12.8));
        System.out.println(ceil(12.8));
        System.out.println(ceil(12.8));

    }
}