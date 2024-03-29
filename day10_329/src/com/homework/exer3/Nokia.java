package com.homework.exer3;

/**
 * ClassName:Nokia
 * Package:com.homework.exer3
 *
 * @Author 86183
 * @Create 2024/3/29 19:01
 */
public class Nokia extends Phone implements G4 {

    public Nokia() {
    }


    @Override
    public void call() {
        System.out.println(brand + "手机，实现普通打电话功能");
    }


}
