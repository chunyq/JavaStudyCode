package com;

/**
 * ClassName:MethodDemo
 * Package:com
 *
 * @Author 86183
 * @Create 2024/3/27 19:17
 */
/*
实现一个类MethodDemo
	2.1 定义一个方法，实现对数组的降序排列；
	2.2 定义一个方法，获取数组的最小值；
    2.3 定义一个方法，实现数组元素的打印 [1,2,3,4]
	2.4 定义一个方法，随机返回一个[50-100]之间的整数
 */
public class MethodDemo {
    public static void main(String[] args) {
        //声明并初始化一个数组
        int[] a = {3,21,5,2,7,9,4,6,1};
        //获取降序排列
        descOrder(a);
        //打印该数组
        printArr(a);
        //获取数组最小值
        System.out.println("该数组最小值："+getMin(a));
        //获取[50,100]的随机整数
        System.out.println("[50,100]的一个整数："+suiJiShu(50,100));

    }

    //实现降序排列
    public static void descOrder(int[] arr) {
        //此处用冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //获取最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //打印数组元素
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x] + "]");
            } else {
                System.out.print(arr[x] + ",");
            }
        }

    }

    //返回[a,b]的随机数
    public static int suiJiShu(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);
    }
}
