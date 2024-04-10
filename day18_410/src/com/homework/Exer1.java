package com.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ClassName:Exer1
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/10 17:22
 */
public class Exer1 {

    public static void main(String[] args) {
        //��������
        String[] s = {"for", "if", "if", "do", "while", "do", "do", "break", "switch", "while"};

        //�洢����Ԫ��(ȥ���ظ�Ԫ��)��ɵļ���
        Set<String> allElements = new HashSet<>();

        // ʹ��HashSet���洢���в��ظ���Ԫ��
        Set<String> uniqueElements = new HashSet<>();

        //�����ظ�Ԫ��
        Set<String> chongFuElements = new HashSet<>();
        for (String elements : s) {
            if (!allElements.add(elements)) {
                chongFuElements.add(elements);
            } else {
                uniqueElements.add(elements);
            }
        }
        uniqueElements.removeAll(chongFuElements);

        System.out.println("����Ԫ����ɵļ��ϣ� " + allElements);
        System.out.println("�ظ�Ԫ����ɵļ��ϣ� " + chongFuElements);
        System.out.println("���ظ�Ԫ����ɵļ��ϣ� " + uniqueElements);


    }
}
