/*
����
��������pwd����ֵ����Ϊ������룻		
	�ڿ���̨�������룬�������λ��᣻
	���������ȷ������ʾ��¼�ɹ���
	��������������ʾ������2 �λ��ᣬ1�λ��᣻
	������ζ������ʾ�������������ϵ����Ա

	 * ��ʾ��Ҫ�õ�Scanner�ࣻ
	 * �ɹ���ʱ����Ҫ�õ�break;
	 * ����Ҫ�õ�ѭ����
 */
import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����
		String pwd = "123456";
		//�������
		int c = 3;
		String guessPwd = "";
		while (c >= 1) {
			System.out.print("����������(�������λ���):");
			guessPwd = sc.next();
			c--;
			if (guessPwd.equals(pwd)) {
				System.out.println("��¼�ɹ���");
				break;
			} else {
				if (c == 0) {
					break;
				}
				System.out.println("�������,������"+c+"�λ���");
			}
		}
		if (c == 0) {
			System.out.println("�����������ϵ����Ա");
		}
		
	}
}