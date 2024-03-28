import java.util.Scanner;

/**
 * ClassName:BubbleSort Package:PACKAGE_NAME Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 12:08
 * @Version 1.0
 */
/*
数组之冒泡排序
相邻元素两两比较，大的往后放，第一次完毕，最大值出现在最大索引位置
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {21, 32, 34, 1, 3, 67, 76};
        int tmp = 0;

        // 两层for循环
        // 要经过arr.length-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            // 每一轮要比较length-1-i次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 二者交换顺序
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        // 实现遍历
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
