import java.util.Scanner;

/**
 * ClassName:BubbleSort Package:PACKAGE_NAME Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 12:08
 * @Version 1.0
 */
/*
����֮ð������
����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ�������������λ��
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {21, 32, 34, 1, 3, 67, 76};
        int tmp = 0;

        // ����forѭ��
        // Ҫ����arr.length-1��
        for (int i = 0; i < arr.length - 1; i++) {
            // ÿһ��Ҫ�Ƚ�length-1-i��
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // ���߽���˳��
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        // ʵ�ֱ���
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
