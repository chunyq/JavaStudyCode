import java.util.Scanner;

/**
 * ClassName:App Package:PACKAGE_NAME Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 20:11
 * @Version 1.0
 */
/*
�������ϵͳ��
	ģ���������APP:
	�����������飺�ֱ�������ʾ �˵��Ͷ�Ӧ�ļ�λ
	ʵ�֣�
		1.��ʾ�˵�
			���磺 1 ������˿  15Ԫ
		2.��ͣ�
			��Ҫ��������������
			�ֱ��������湺�����Ʒ(���)����Ӧ��������
			�����޴ε��(�����ض�ָ���ʾ�˳� ����88 )
		3.��ʾ����
			1 ������˿  3��  ����15Ԫ	��45Ԫ
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"������˿", "���ѳ���", "����", "����", "ţ��"};
        double[] price = {15.5, 13, 12, 1.5, 2};
        // �������鱣�湺�����Ʒ����
        int[] quan = new int[menu.length];
        int in = 0;
        while (true) {
            // ��ʾ�˵�
            System.out.println("�������²�Ʒ");
            System.out.println("=========================");
            System.out.println("���\t����\t\t��λ");
            System.out.println("=========================");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + "\t" + menu[i] + "\t\t" + price[i]);
            }
            // ��͹���
            System.out.println("==========��͵Ĺ���===============");
            System.out.println("���ͣ����� 88��ͽ���");
            in = sc.nextInt();
            if (in == 88) {
                System.out.println("��ӭ�´ι��٣�");
                break;
            } else {
                int index = in - 1;
                if (index >= 0 && index < menu.length) {
                    System.out.println("������������");
                    int o = sc.nextInt();
                    quan[index] += o;

                } else {
                    System.out.println("��Ч�Ĳ˵�ѡ�");
                }

            }
        }

        // ���ɶ���
        System.out.println("=====���ɶ���=====");
        System.out.println("��Ʒ����\t��Ʒ����\t��������\t С��");
        int total = 0;
        for (int i = 0; i < menu.length; i++) {
            if (quan[i] > 0) {
                total += quan[i] * price[i];
                System.out.println(menu[i] + "\t\t" + price[i] + "\t" + quan[i] + "\t" + quan[i] * price[i]);
            }
        }
        System.out.println("-------------------------------�ܼƣ�" + total + "Ԫ");

        // ѡ��֧����ʽ
        System.out.println("��ѡ��֧����ʽ  1֧����  2 ΢��֧��");
        int pay = sc.nextInt();
        if (pay == 1) {
            System.out.println(" >>>> ��ת��֧����֧��ҳ��.....");
        } else if (pay == 2) {
            System.out.println(">>>> ��ת��΢��֧��ҳ��.....");
        } else {
            System.out.println("�����������������");
        }

    }
}
