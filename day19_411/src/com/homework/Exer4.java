package com.homework;

import com.sun.net.httpserver.Headers;

import java.util.*;
import java.util.function.ToIntFunction;

/**
 * ClassName:Exer4
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/11 19:21
 */
/*
斗地主案例步骤：
      1. 组装牌
      2. 洗牌
      3. 发牌
      4. 看牌
 */
public class Exer4 {
    public static void main(String[] args) {
        //组装牌
        //牌盒,将索引和牌面信息固定，再通过list去poker中定位牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建存储牌编号的集合
        ArrayList<Integer> list = new ArrayList<>();
        //创建牌的索引
        int index = 2;
        //创建两个数组存牌的信息
        //花色
        String[] colors = {"♦", "♥", "♣", "♠"};
        //数字
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //遍历花色和数字数组
        for (String number : numbers) {
            for (String color : colors) {
                String p = number + color;
                poker.put(index, p);
                list.add(index);
                index++;
            }
        }
        //存大王、小王
        poker.put(0, "大王");
        list.add(0);

        poker.put(1, "小王");
        list.add(1);


        System.out.println(list);
        for (Map.Entry<Integer, String> entry : poker.entrySet()) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i < 3) {
                //给底牌
                diPai.add(list.get(i));
            } else if (i % 3 == 0) {
                //玩家1
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                //玩家2
                player2.add(list.get(i));
            } else if (i % 3 == 2) {
                //玩家3
                player3.add(list.get(i));
            }
        }

        //排序
        // 排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);


        //看牌
        lookPai("刘备", player1, poker);
        lookPai("孙权", player2, poker);
        lookPai("曹操", player3, poker);
        lookPai("底牌", diPai, poker);


    }

    public static void lookPai(String playName, ArrayList<Integer> list, HashMap<Integer, String> poker) {
        System.out.print(playName + "牌是：");
        for (Integer key : list) {
            System.out.print(poker.get(key) + "\t");
        }
        System.out.println();
    }
}
