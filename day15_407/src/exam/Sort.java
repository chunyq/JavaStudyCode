package exam;

import java.util.Scanner;

/**
 * ClassName:Sort
 * Package:exam
 *
 * @Author 86183
 * @Create 2024/4/7 15:02
 */
//数组冒泡排序
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义一个十个长度的整型数组
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个元素(最多十个)：");
            a[i] = sc.nextInt();
        }
        //开始升序冒泡排序
        BubbleSort(a);

        //打印排序后的数组
        Print(a);

    }

    public static void BubbleSort(int[] arr) {
        // 两层for循环
        // 要经过arr.length-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            // 每一轮要比较length-1-i次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 二者交换顺序
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void Print(int[] arr) {
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
