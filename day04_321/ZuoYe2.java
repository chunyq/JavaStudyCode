/*
����������ģ����������ܣ��Զ��������int���͵����ݽ��мӡ������ˡ��������㣬����ӡ������
Ҫ��
(1)������������,����ǰ������������μ���������ݣ�
����������ΪҪ���е�����
(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������)
(2)ʹ�ý�����ѧ֪ʶ switch case ��ɹ���
(3)��ʾ��ʽ����:
	��һ������:30
	�ڶ�������:40
	��Ҫ���е������Ǽӷ�����
	30+40=70
 */

import java.util.Scanner;

public class ZuoYe2 {
	public static void main(String[] args) {
		// ����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.print("��һ��������");
		double n1 = sc.nextDouble();
		System.out.print("�ڶ���������");
		int n2 = sc.nextInt();
		System.out.print("��Ҫ���е�������(0:��ʾ�ӷ�,1:��ʾ����,2:��ʾ�˷�,3:��ʾ����)��");
		int c = sc.nextInt();
		// switch��֧��ʼ�ж�����
		switch(c){
			case 0:
				System.out.println("��Ҫ���е������Ǽӷ�����");
				System.out.print((int)n1+"+"+n2+"="+((int)n1+n2));
				break;
			case 1:
				System.out.println("��Ҫ���е������Ǽ�������");
				System.out.print((int)n1+"-"+n2+"="+((int)n1-n2));
				break;
			case 2:
				System.out.println("��Ҫ���е������ǳ˷�����");
				System.out.print((int)n1+"*"+n2+"="+((int)n1*n2));
				break;
			case 3:
				System.out.println("��Ҫ���е������ǳ�������");
				if (n2 == 0) {
					System.out.println("��������Ϊ0,����������");
				} else {
					System.out.print((int)n1+"/"+n2+"="+(n1/n2));
				}
				break;
		}
	}

}