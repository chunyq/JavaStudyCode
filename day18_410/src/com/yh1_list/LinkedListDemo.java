package com.yh1_list;

import java.util.LinkedList;

/**
 * ClassName:LinkedListDemo
 * Package:com.yh1_list
 *
 * @Author 86183
 * @Create 2024/4/10 10:53
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        //LinkedList��֧��ͨ������ֱ�ӷ���Ԫ��
        //����Ԫ����Ҫ������������
        //��
        System.out.println(linkedList.add("yang")); //true
        linkedList.addFirst("zhu"); //��������ֵΪvoid
        linkedList.addLast("xuzongy");
        System.out.println(linkedList);

        //�ģ�ͬListһ��
        //�� ���У�getFirst() getLast()
        System.out.println(linkedList.getFirst()); //��
        System.out.println(linkedList.getLast()); //β

        //

    }
}
