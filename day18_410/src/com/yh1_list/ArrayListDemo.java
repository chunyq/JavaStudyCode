package com.yh1_list;

import java.util.ArrayList;

/**
 * ClassName:ArrayListDemo
 * Package:com.yh1_list
 *
 * @Author 86183
 * @Create 2024/4/10 10:32
 */
/*
ArrayList��ΪList��ʵ���࣬List��Collection�ķ���������
������Ҫ�������������еķ���
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("13232");
        arrayList.add(0, "74545");
        arrayList.add("6453");
        System.out.println(arrayList);

        //��ɾ�Ĳ�ķ���ͬListһ��
    }
}
