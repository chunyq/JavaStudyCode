//��ϰ������������ĳɼ�:
//�ɼ���	90-100 ���䣬�������������--������һ�����г���
//�ɼ���	70-90 ���䣬������ɼ����ã�����һ�����ν�գ�
//�ɼ���	60-70 ���䣬����������ˣ�����һƿ�޹���AD���̣�
//�ɼ���	0-60  ���䣬�������ĸ���˫��
import java.util.Scanner;

public class IfDemo03  {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		Scanner sc = new Scanner(System.in);
		System.out.print("������С���ķ�����");
		double s = sc.nextInt();
		// �ж�
		if (s>=0 && s<=100) {
			if (s>=90) {
				System.out.println("��������--������һ�����г���");
			} else if (s>=70 && s<90) {
				System.out.println("�ɼ����ã�����һ�����ν�գ�");
			} else if (s>=60 && s<70) {
				System.out.println("�����ˣ�����һƿ�޹���AD���̣�");
			} else {
				System.out.println("��ĸ���˫��");
			}
		} else {
			System.out.println("��������");
		}

	}
}