package com.yh;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*
  public static <T> List<T> asList(T... a):把数组转成集合
  注意事项：
  		虽然可以把数组转成集合，但是集合的长度不能改变。
 转换关系:
  数组 -- list集合:
    list=Arrays.asList(数组);
  数组 -- Set集合:
        list=Arrays.asList(数组);
        set = new HashSet<>(list);

        或者:
        set = Arrays.stream(str2).collect(Collectors.toSet())

 */
public class ArraysDemo {
    public static void main(String[] args) {
        //数组 -- list集合
    /*    String[] str = {"hello","world","java"};
        List<String> list = Arrays.asList(str);
        System.out.println(list);
*/
/*         System.out.println("====================");
        //数组 -- set集合 方式一
        String[] s = {"a","b","c"};
        //先转list
        List<String> list = Arrays.asList(s);
        //再转set  
        Set<String> set = new HashSet<>(list);
        set.forEach(System.out::println);
     */
        //数组 -- set集合 方式二
        String[] str2 = {"hello", "world", "java"};
        Set<String> set = Arrays.stream(str2).collect(Collectors.toSet());
        System.out.println(set);
    }
}