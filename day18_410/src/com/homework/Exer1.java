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
        //创建数组
        String[] s = {"for", "if", "if", "do", "while", "do", "do", "break", "switch", "while"};

        //存储所有元素(去除重复元素)组成的集合
        Set<String> allElements = new HashSet<>();

        // 使用HashSet来存储所有不重复的元素
        Set<String> uniqueElements = new HashSet<>();

        //计算重复元素
        Set<String> chongFuElements = new HashSet<>();
        for (String elements : s) {
            if (!allElements.add(elements)) {
                chongFuElements.add(elements);
            } else {
                uniqueElements.add(elements);
            }
        }
        uniqueElements.removeAll(chongFuElements);

        System.out.println("所有元素组成的集合： " + allElements);
        System.out.println("重复元素组成的集合： " + chongFuElements);
        System.out.println("不重复元素组成的集合： " + uniqueElements);


    }
}
