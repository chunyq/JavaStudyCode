package com.yunhe01_interface.exer1;

/**
 * ClassName:Camera
 * Package:com.yunhe01_interface.exer1
 *
 * @Author 86183
 * @Create 2024/3/29 15:36
 */
//ʵ����Camera
//ʵ��implements
public class Camera implements USB {
    //����Ҫ��д�ӿڵĳ��󷽷�
    @Override
    public void start() {
        System.out.println("�������ʼ����");
    }

    @Override
    public void stop() {
        System.out.println("�����ֹͣ����");
    }

}