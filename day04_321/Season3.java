import java.util.Scanner;

public class Season3  {
	public static void main(String[] args) {
		// ����ʹ����Ŀ�������ɶԱ����·��ж������Ӧ����
		Scanner sc = new Scanner(System.in);
		System.out.println("��ʼ");
		System.out.print("�������·ݣ�");
		int month = sc.nextInt();
		// if-else�ж�
		/*if (month>=1 && month<=12) {
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
		}*/

		// switch-case �ж�
		// ����case�Ĵ�͸��
		/* �� switch ����У���� case �ĺ��治д break�������ִ�͸����Ҳ����һ��
		ƥ��ɹ����������ж���һ�� case ��ֵ��ֱ��������У�ֱ������ break ����
		���� switch ��������ִ����ֹ�� */
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("��������");
				break;
		}
			
	}
}