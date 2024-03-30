package com.basic;

/**
 * ClassName:MethodDemo
 * Package:com.basic
 *
 * @Author 86183
 * @Create 2024/3/30 9:11
 */
/*
    5.1 定义一个方法，实现对数组的升序序排列；
    5.2 定义一个方法，获取数组的最大值；
    5.3 定义一个方法，实现数组元素的打印 [1,2,3,4]
 */
public class MethodDemo {
    public static void main(String[] args) {
        int[] a = {2,1,6,4,87,9,0,4,3,5};
        bubbleSort(a);
        System.out.println("该数组最大值："+getMax(a));
        printArr(a);
    }

    //升序排列
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //获取最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //打印数组
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
}
