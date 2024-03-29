package com.homework.exer3;

/**
 * ClassName:Mi
 * Package:com.homework.exer3
 *
 * @Author 86183
 * @Create 2024/3/29 19:01
 */
public class Mi extends Phone implements G5 {
    public Mi() {
    }

    @Override
    public void videoCall() {
        System.out.println(brand + "手机，实现视频通话功能");
    }
}
