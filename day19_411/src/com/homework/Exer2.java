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
        String[] goods = {"跑鞋", "牛奶", "跑鞋", "泡面", "果啤", "牛奶", "泡面", "牛奶", "牙刷", "电脑"};
        //创建集合
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (String good : goods) {
            //如果商品已经在Map中，增加数量
            if (hashMap.containsKey(good)) {
                hashMap.put(good, hashMap.get(good) + 1);
            } else {
                hashMap.put(good, 1);
            }
        }

        //遍历HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("商品: " + entry.getKey() + ", 数量: " + entry.getValue());
        }
    }
}
