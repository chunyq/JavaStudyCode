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
//键盘录入一个字符串中每个字符出现次数。要求结果的格式： a(5)b(4)c(3)d(2)e(1)
public class Exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串(英文)：");
        String s = sc.nextLine();
        sc.close();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        //遍历字符串
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        //输出结果
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }

    }
}
