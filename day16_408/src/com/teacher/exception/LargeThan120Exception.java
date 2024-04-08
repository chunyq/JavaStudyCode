package com.teacher.exception;

/**
 * @Author yh
 * @create 15:56
 */
public class LargeThan120Exception extends Exception {
//public class LargeThan120Exception extends RuntimeException {

    public LargeThan120Exception() {
        super("年龄大于120的异常");
    }

    public LargeThan120Exception(String msg) {
        super(msg);
    }
}
