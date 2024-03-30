package com.basic;

/**
 * ClassName:MethodDemo
 * Package:com.basic
 *
 * @Author 86183
 * @Create 2024/3/30 9:11
 */
/*
    5.1 ����һ��������ʵ�ֶ���������������У�
    5.2 ����һ����������ȡ��������ֵ��
    5.3 ����һ��������ʵ������Ԫ�صĴ�ӡ [1,2,3,4]
 */
public class MethodDemo {
    public static void main(String[] args) {
        int[] a = {2,1,6,4,87,9,0,4,3,5};
        bubbleSort(a);
        System.out.println("���������ֵ��"+getMax(a));
        printArr(a);
    }

    //��������
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

    //��ȡ���ֵ
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //��ӡ����
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
