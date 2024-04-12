package com.homework;

import java.util.HashSet;
import java.util.Iterator;

/**
 * ClassName:Exer1
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/11 16:57
 */
public class Exer1 {
    public static void main(String[] args) {
        //存储学生成绩
        int[] scorce = {60, 70, 80, 65, 78, 89, 87, 78, 65};

        //存储所有成绩（不包含重复元素）
        HashSet<Integer> allE = new HashSet<>();
        //存储不重复的成绩
        HashSet<Integer> uniqueE = new HashSet<>();
        //存储重复的成绩
        HashSet<Integer> chongFuE = new HashSet<>();

        for (int s : scorce) {
            if (!allE.add(s)) {
                chongFuE.add(s);
            }
        }
        uniqueE.addAll(allE);
        uniqueE.removeAll(chongFuE);

        //Iterator遍历
        Iterator<Integer> iterator = uniqueE.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
