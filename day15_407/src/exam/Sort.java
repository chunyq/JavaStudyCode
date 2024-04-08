package exam;

import java.util.Scanner;

/**
 * ClassName:Sort
 * Package:exam
 *
 * @Author 86183
 * @Create 2024/4/7 15:02
 */
//����ð������
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //����һ��ʮ�����ȵ���������
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("�������" + (i + 1) + "��Ԫ��(���ʮ��)��");
            a[i] = sc.nextInt();
        }
        //��ʼ����ð������
        BubbleSort(a);

        //��ӡ����������
        Print(a);

    }

    public static void BubbleSort(int[] arr) {
        // ����forѭ��
        // Ҫ����arr.length-1��
        for (int i = 0; i < arr.length - 1; i++) {
            // ÿһ��Ҫ�Ƚ�length-1-i��
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // ���߽���˳��
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
