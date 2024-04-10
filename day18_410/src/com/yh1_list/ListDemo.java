package com.yh1_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName:ListDemo
 * Package:com.yh1_list
 *
 * @Author 86183
 * @Create 2024/4/10 10:13
 */
public class ListDemo {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //ʵ��������ת��Ϊ�ӿ�����
        //�̳���Collection�ӿ��е�ȫ��������
        //���һ�������һЩ����Ԫ���������������ϵ����з���
        List<String> list = new ArrayList<>();

        //�� add(int index, E element)
        list.add(0, "yang");
        list.add("zhu");
        list.add(0, "ma");
        list.add(1, "xuzongyan");

        System.out.println("list����Ϊ" + list.size());
        System.out.println(list);

        //ɾ remove(int index)
        System.out.println(list.remove(0));//xuzongyan
        System.out.println(list);

        //�� set(int index, E element)
        System.out.println(list.set(0, "yang")); //ma
        System.out.println(list);

        //�� get(int index)
        System.out.println(list.get(list.size() - 1)); //index!=list.size()


        //����
        //1��������Iterator
        System.out.println("===========");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //2��for-each��ǿѭ����lambda���ʽ
        System.out.println("===========");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=====");
        list.forEach(System.out::println);

        //3��for+get����
        System.out.println("===list���еı���===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
