/*
ATM���ϵͳ
	ѡ� 1.��ѯ  2.���  3. ȡ��  4. �˿�

 */
import java.util.Scanner;
public class Atm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�˻����
		double money = 0;
		//ȡ����
		double qu = 0;
		//�����
		double cun = 0;
		// ������
		int c = 0;
		while(true){
			System.out.println("=============================");
			System.out.println("======ATM���ϵͳ=============");
			System.out.println("======��ѡ�����Ĳ�����=========");
			System.out.println("======1.��ѯ���===============");
			System.out.println("======2.���===================");
			System.out.println("======3.ȡ��===================");
			System.out.println("======4.�˿�===================");
			System.out.print("��ѡ�����Ĳ�����");
			c = sc.nextInt();
			switch(c){
				case 1:
					System.out.println("������[�鿴���]");
					System.out.println("��ǰ���Ϊ"+money+"Ԫ");
					break;
				case 2:
					System.out.print("��������Ľ�");
					cun = sc.nextDouble();
					System.out.println("������[���]");
					if (cun>0) {
						money += cun;
					} else {
						System.out.println("�����Ӧ����0");
					}
					System.out.println("������");
					System.out.println("��ǰ���Ϊ"+money+"Ԫ");
					break;
				case 3:
					System.out.print("������ȡ��Ľ�");
					qu = sc.nextDouble();
					if (qu > 0 && qu <= money) {
						money -= qu;
						System.out.println("������[ȡ��]");
						System.out.println("ȡ�����");
					} else if (qu > money) {
						System.out.println("����");
					} else {
						System.out.println("ȡ����Ӧ����0");
					}
					System.out.println("��ǰ���Ϊ"+money+"Ԫ");
					break;
				case 4:
					System.out.println("�˿��ɹ���");
					System.out.println("��лʹ��ATM�����ټ���");
					return ;
				default:
					System.out.println("�����������������룡");

			}
		} 
	}
}