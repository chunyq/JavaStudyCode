import java.util.Scanner;

public class ZuoYe  {
	public static void main(String[] args) {
		//1����������һ����������ʾ�·ݣ���� ����·��ж�����
		Scanner sc = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = sc.nextInt();
		//if-else
		/*if (month<=12 && month>=1) {
			if (month == 1|| month == 3 || month == 5 || 
				month == 7 || month ==8 || month == 10 
				|| month ==12) {
				System.out.println(month+"�·���31��");
			} else if (month == 2 ) {
				System.out.println(month+"�·���28���29��");
			} else {
				System.out.println(month+"�·���30��");
			}
		} else {
			System.out.println("��������");
		}*/

		//1����������һ����������ʾ�·ݣ���� ����·��ж�����
		//switch
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"�·���31��");
				break;
			case 2:
				System.out.println(month+"�·���28���29��");
				break;
			case 4,6,9,11:
				System.out.println(month+"�·���30��");
				break;
			default:
				System.out.println("��������");
				break;
		}
	}
}