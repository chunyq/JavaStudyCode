import java.util.Scanner;

/**
 * ClassName:Max
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 18:50
 * @Version 1.0
 */
public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("������5������(���ּ��ÿո�����)��");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("���ֵΪ��" + max);
    }
}
