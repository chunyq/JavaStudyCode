import java.util.*;

public class SuiJi {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*10)+1;
		/*System.out.println(num);*/	
		System.out.print("��ȷ��Ҫ�µĴ�����");
		int m = sc.nextInt();
		// ����������
		int count = 0;
		//���µ�����
		int guessNum;
		for (; m>=1; m-- ) {
			System.out.println("������"+m+"�λ���");
			//ÿѭ��һ��,ÿ��һ��,������+1
			count++;
			//����һ������
			System.out.print("���һ��1~10������");
			guessNum = sc.nextInt();
			//�ж�������ֺ����ɵ�������Ƿ����
			if (guessNum == num) {
				System.out.println("��ϲ��,�¶���,��һ������"+count+"��");
				break;
			} else if (guessNum > num) {
				System.out.println("��´���");
			} else {
				System.out.println("���С��");
			}
		}
		
	}
}