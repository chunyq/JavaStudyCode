package com.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName:ShoppingCard
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/15 0:06
 */
public class ShoppingCard {
    static Map<Integer, String> goods = new HashMap<Integer, String>();
    static Map<Integer, Double> map2 = new HashMap<Integer, Double>();

    public static void main(String[] args) {

        //    ��Ʒ��Ϣ��
        goods.put(1001, "�ֻ�");
        goods.put(1002, "����");
        goods.put(1003, "���");
        goods.put(1004, "·����");
        goods.put(1005, "����");
        goods.put(1006, "ƻ��");
        goods.put(1007, "����");
        goods.put(1008, "����");
        goods.put(1009, "����");
        goods.put(1010, "�յ�");
        goods.put(1011, "�緹��");

        //    ��Ʒ��ź͵���
        map2.put(1001, 1999.0);
        map2.put(1002, 3500.0);
        map2.put(1003, 25.0);
        map2.put(1004, 50.0);
        map2.put(1005, 100.0);
        map2.put(1006, 1.5);
        map2.put(1007, 9.0);
        map2.put(1008, 2000.0);
        map2.put(1009, 999.0);
        map2.put(1010, 1500.0);
        map2.put(1011, 300.0);

//    printGoods();
        HashMap<Integer, Integer> bag = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        printGoods();
        e1:
        for (; ; ) {
            System.out.println("���������빺�����Ʒ��ţ�������88�������");
            int a = sc.nextInt();
            if (a == 88) {
                break e1;
            }
            if (goods.get(a) != null) {
                System.out.println("�����빺���������");
                int b = sc.nextInt();
                if (!bag.containsKey(a)) {
                    bag.put(a, b);
                } else {
                    b = bag.get(a) + b;
                    bag.put(a, b);
                }
            } else {
                System.out.println("��Ʒ�Ѿ��¼ܣ����������¹��򣡣���");
            }
        }
        System.out.println("-----------�����嵥------------");
        System.out.println("��Ʒ��\t����\t\t����\t\tС��");
        Set<Map.Entry<Integer, Integer>> bes = bag.entrySet();
        double sum = 0;
        int all = 0;
        for (Map.Entry<Integer, Integer> be : bes) {
            all += be.getValue();
            sum += be.getValue() * map2.get(be.getKey());
            System.out.println(goods.get(be.getKey()) + "\t\t" + be.getValue() + "\t\t" + map2.get(be.getKey()) + "\t" + be.getValue() * map2.get(be.getKey()));
        }
        System.out.println("--------------------------------");
        System.out.println("�ܼ�����" + all + "        �ܼۣ�" + sum);
    }

    public static void printGoods() {
        Set<Map.Entry<Integer, String>> gset = goods.entrySet();
        int count = 1;
        for (Map.Entry<Integer, String> g : gset) {
            System.out.print(g.getKey() + ":" + g.getValue() + " ");
            if (count > 2 && count % 3 == 0) {
                System.out.println();
            }
            count++;
        }
    }
}
