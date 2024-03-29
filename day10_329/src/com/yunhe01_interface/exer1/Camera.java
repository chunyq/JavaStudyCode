package com.yunhe01_interface.exer1;

/**
 * ClassName:Camera
 * Package:com.yunhe01_interface.exer1
 *
 * @Author 86183
 * @Create 2024/3/29 15:36
 */
//实现类Camera
//实现implements
public class Camera implements USB {
    //必须要重写接口的抽象方法
    @Override
    public void start() {
        System.out.println("照相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("照相机停止工作");
    }

}
