package com.homework.exer2;

/**
 * ClassName:Phone
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/3/29 18:49
 */
/*
包含空参、满参构造和以下成员变量
    名称name（ String 型）
    生成所有成员变量set/get方法
 */
public abstract class Phone extends Bluetooth {
    private String name;

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
