package com.homework.exer1;

/**
 * ClassName:Test
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/1 18:34
 */
public class Test {
    public static void main(String[] args) {
        //∂‡Ã¨
        Pet p = new Pig();
        Pet s = new Sleep();
        //System.out.println(p instanceof Sleep);
        if (p instanceof Pig) {
            Pig p2 = (Pig) p;
            p2.shout();
        }
        if (s instanceof Sleep) {
            Sleep s2 = (Sleep) s;
            s2.shout();
        }

    }
}
