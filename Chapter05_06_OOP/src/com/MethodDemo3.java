package com;

/**
 * ClassName:MethodDemo3
 * Package:com
 *
 * @Author 86183
 * @Create 2024/3/27 14:20
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 5, 3, 9, 7, 13, 56};
        //升序排序
        bubbleSort(a);
        //遍历排序后的数组
        bianLi(a);
    }

    //冒泡排序(升序)
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

    //数组遍历
    public static void bianLi(int[] arr) {
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
