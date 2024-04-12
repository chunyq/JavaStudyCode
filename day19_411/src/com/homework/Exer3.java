package com.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName:Exer3
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/11 19:02
 */
//����¼��һ���ַ�����ÿ���ַ����ִ�����Ҫ�����ĸ�ʽ�� a(5)b(4)c(3)d(2)e(1)
public class Exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������һ���ַ���(Ӣ��)��");
        String s = sc.nextLine();
        sc.close();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        //�����ַ���
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        //������
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }

    }
}
