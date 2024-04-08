package com.yh.exception;

/**
 * @Author yh
 * @create 15:56
 */
//  一个类继承了java.lang.Exception或RuntimeException类，这个类就是异常类
public class LessThan0Exception extends Exception {//编译器
//public class LessThan0Exception extends RuntimeException {//运行期

    public LessThan0Exception() {
        super("年龄小于0的异常");
    }

    public LessThan0Exception(String msg) {
        super(msg);
    }
}
