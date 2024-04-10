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

        //�������϶���
        List<Integer> list = new ArrayList<>();
        //���Ԫ��
        list.add(430);
        list.add(320);
        list.add(34);
        list.add(30);
        list.add(123);
        System.out.println(list);

        //Collections.sort(list);   ��������
        Collections.sort(list);
        Collections.reverse(list); //sort+reverse --> ��������
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


    }
}
