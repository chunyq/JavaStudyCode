//����
import java.util.Scanner;

public class OuShu{
	public static void main(String[] args) {
		System.out.println("��ʼ");
		//������������һ���������ж���Ϊ��������ż��������ӡ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��������");
		int n = sc.nextInt();
		if (n%2 == 0){
			System.out.println(n+"��һ��ż��");
		} else {
			System.out.println(n+"��һ������");
		}
		System.out.println("����");
	}
}