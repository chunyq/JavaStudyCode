package com.homework.exer2;

/**
 * ClassName:Phone
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/3/29 18:49
 */
/*
�����ղΡ����ι�������³�Ա����
    ����name�� String �ͣ�
    �������г�Ա����set/get����
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
