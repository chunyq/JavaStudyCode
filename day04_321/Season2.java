import java.util.Scanner;

public class Season2  {
	public static void main(String[] args) {
		// ���󣺶Ա����·��ж������Ӧ����
		Scanner sc = new Scanner(System.in);
		System.out.println("��ʼ");
		System.out.print("�������·ݣ�");
		int month = sc.nextInt();
		// if-else�ж�
		if (month>=1 && month<=12) {
			if (month>=3 && month<=5) {
				System.out.println("����");
			} else if (month>=6 && month<=8) {
				System.out.println("�ļ�");
			} else if (month>=9 && month<=11) {
				System.out.println("�＾");
			} else {
				System.out.println("����");
			}
		} else {
			System.out.println("��������");
		}
	}
}