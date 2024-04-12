package com.teacher.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 1.  Map集合:
 * java.util.Map接口:Java用来存放一一对应的关系(映射关系)的对象的集合
 * 2.Map与Collection集合区别
 * <p>
 * - Collection集合<T>
 * 单列集合，一次只能添加一个元素
 * 有的是有索引，有的没有索引
 * 有的集合可以存储重复的元素，有的则不可以
 * 有的元素是无序的，有的是有序的
 * - Map集合
 * Map集合是双列集合，由Key和Value组成
 * Key是不允许重复的，Value是允许重复
 * Key允许存null值的，但是只能存储唯一的一个
 * <p>
 * 3. Map集合中常用的子类
 * <p>
 * - HashMap
 * 存储数据采用的哈希表结构，元素的存取顺序不能保证一致。由于要保证键的唯一、不重复，需要重写键的hashCode()方法、equals()方法。
 * - LinkedHashMap
 * HashMap下有个子类LinkedHashMap，存储数据采用的哈希表结构+链表结构。通过链表结构可以保证元素的存取顺序一致；通过哈希表结构可以保证的键的唯一、不重复，需要重写键的hashCode()方法、equals()方法。
 * <p>
 * 4.Map接口中常用的方法
 * <p>
 * 方法名                                  	说明
 * public V put(K key, V value)         	把指定的键与指定的值添加到Map集合中。
 * public V remove(Object key)          	把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
 * public V get(Object key)             	根据指定的键，在Map集合中获取对应的值。
 * boolean containsKey(Object key)      	判断集合中是否包含指定的键。
 * public Set<K> keySet()               	获取Map集合中所有的键，存储到Set集合中。
 * public Set<Map.Entry<K,V>> entrySet()
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        String s = map.put("铁锅", "大鹅");//添加或修改 返回旧值
        String s2 = map.put("铁锅", "炖自己");
        //map.remove("铁锅");//移除
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");

        System.out.println(map);
        System.out.println(map.get("郭靖"));
        System.out.println(map.containsKey("铁锅"));
        System.out.println(map.containsValue("铁锅"));
        System.out.println(map.size());//3
        System.out.println(map.isEmpty());

        //System.out.println(s);
        //System.out.println(s2);

        //获取所有的key
        Set<String> keys = map.keySet();
        //   方式一: keyset 遍历
        for (String key : keys) {
            String v = map.get(key);
            System.out.println(key + "====" + v);
        }
        System.out.println("==Entry===");
        Set<Map.Entry<String, String>> entries = map.entrySet();


        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "::::" + value);
        }

        System.out.println("======");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "::::" + value);
        }

        System.out.println("=========");// () -> {   }
        map.forEach((key, value) -> {
            System.out.println(key + "::::" + value);
        });


    }
}
