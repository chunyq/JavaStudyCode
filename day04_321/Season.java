import java.util.Scanner;

public class Season  {
	public static void main(String[] args) {
		// ����ʹ����Ŀ�������ɶԱ����·��ж������Ӧ����
		Scanner sc = new Scanner(System.in);
		System.out.println("��ʼ");
		System.out.print("�������·ݣ�");
		int month = sc.nextInt();
		String s = (month>12 || month<1) ? "��������" : 
				   (month>=3 && month<=5) ? "����" :
			       (month>=6 && month<=8) ? "�ļ�" :
			       (month>=9 && month<=11) ? "�＾" : "����";
		System.out.println("������"+s);
	}
}