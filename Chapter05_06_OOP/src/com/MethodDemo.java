package com;

/**
 * ClassName:MethodDemo
 * Package:com
 *
 * @Author 86183
 * @Create 2024/3/27 19:17
 */
/*
ʵ��һ����MethodDemo
	2.1 ����һ��������ʵ�ֶ�����Ľ������У�
	2.2 ����һ����������ȡ�������Сֵ��
    2.3 ����һ��������ʵ������Ԫ�صĴ�ӡ [1,2,3,4]
	2.4 ����һ���������������һ��[50-100]֮�������
 */
public class MethodDemo {
    public static void main(String[] args) {
        //��������ʼ��һ������
        int[] a = {3,21,5,2,7,9,4,6,1};
        //��ȡ��������
        descOrder(a);
        //��ӡ������
        printArr(a);
        //��ȡ������Сֵ
        System.out.println("��������Сֵ��"+getMin(a));
        //��ȡ[50,100]���������
        System.out.println("[50,100]��һ��������"+suiJiShu(50,100));

    }

    //ʵ�ֽ�������
    public static void descOrder(int[] arr) {
        //�˴���ð������
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

    //��ȡ��Сֵ
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //��ӡ����Ԫ��
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

    //����[a,b]�������
    public static int suiJiShu(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);
    }
}
