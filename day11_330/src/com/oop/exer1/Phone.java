package com.oop.exer1;

/**
 * ClassName:Phone
 * Package:com.oop.exer1
 *
 * @Author 86183
 * @Create 2024/3/30 9:56
 */
public class Phone {
    String brand; //手机品牌
    long phoneNum; //手机号

    public Phone() {
    }

    public Phone(String brand, long phoneNum) {
        this.brand = brand;
        this.phoneNum = phoneNum;
    }

    public void call() {
        System.out.println("使用" + brand + "手机，手机号" + phoneNum + "打电话");
    }

    //发信息
    public void message(){
        System.out.println("在给"+phoneNum+"发消息");
    }

}
