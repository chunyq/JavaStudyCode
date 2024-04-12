package com.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Exer2
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/11 17:50
 */
public class Exer2 {
    public static void main(String[] args) {
        String[] goods = {"��Ь", "ţ��", "��Ь", "����", "��ơ", "ţ��", "����", "ţ��", "��ˢ", "����"};
        //��������
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (String good : goods) {
            //�����Ʒ�Ѿ���Map�У���������
            if (hashMap.containsKey(good)) {
                hashMap.put(good, hashMap.get(good) + 1);
            } else {
                hashMap.put(good, 1);
            }
        }

        //����HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("��Ʒ: " + entry.getKey() + ", ����: " + entry.getValue());
        }
    }
}
