package com.yh1_map;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:HashMapTest
 * Package:com.yh1_map
 *
 * @Author 86183
 * @Create 2024/4/11 14:44
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("�������", "��");
        System.out.println(map.put("���", "С��Ů"));
        //���ص������ "���" �����ľ�ֵ�����û�о�ֵ����֮ǰû��Ϊ "���" ���ù�ֵ�����򷵻� null��
        String s = map.put("����", "���");

        System.out.println(map);
    }
}
