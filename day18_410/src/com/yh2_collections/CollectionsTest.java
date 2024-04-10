package com.yh2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName:CollectionsTest
 * Package:com.yh2_collections
 *
 * @Author 86183
 * @Create 2024/4/10 16:55
 */
public class CollectionsTest {
    public static void main(String[] args) {

        //创建集合对象
        List<Integer> list = new ArrayList<>();
        //添加元素
        list.add(430);
        list.add(320);
        list.add(34);
        list.add(30);
        list.add(123);
        System.out.println(list);

        //Collections.sort(list);   升序排列
        Collections.sort(list);
        Collections.reverse(list); //sort+reverse --> 倒序排列
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


    }
}
