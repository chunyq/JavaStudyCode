//����
import java.util.Scanner;

public class IfDemo02{
	public static void main(String[] args) {
		System.out.println("��ʼ");
		Scanner sc = new Scanner(System.in);
		// ����:����¼��һ��������(1,2...,7)
		// �����Ӧ������һ�����ڶ���������������
		System.out.print("������������(1,2...,7):");
		int n = sc.nextInt();
		if(n == 1){
			System.out.println("����һ");
		} else if(n == 2){
			System.out.println("���ڶ�");
		} else if (n == 3) {
			System.out.println("������");
		} else if (n == 4) {
			System.out.println("������");
		} else if (n == 5) {
			System.out.println("������");
		} else if (n == 6) {
			System.out.println("������");
		} else if (n == 7) {
			System.out.println("������");
		}
		System.out.println("����");
	}
}