package com.yh;

/**
 * hashcode不同 :元素肯定不同
 * hashcode相同:不一定相同
 * 通过equals()比较内容是否相同:
 * 相同:元素相同
 * 不相同:元素不同
 * <p>
 * 元素相同 hashcode一定相同
 * hashcode相同 元素不一定相同
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        System.out.println("中".hashCode());// 20013
        System.out.println("国".hashCode());// 22269

        String s = "重地";
        String s2 = new String("通话");

        System.out.println(s.hashCode());//1179395

        System.out.println(s2.hashCode());//  1179395
    }
}
