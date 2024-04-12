package com.yh1_map;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:HashMapTest
 * Package:com.yh1_map
 *
 * @Author 86183
 * @Create 2024/4/11 14:44
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("独孤求败", "雕");
        System.out.println(map.put("杨过", "小龙女"));
        //返回的是与键 "杨过" 关联的旧值，如果没有旧值（即之前没有为 "杨过" 设置过值），则返回 null。
        String s = map.put("铁锅", "大鹅");

        System.out.println(map);
    }
}
