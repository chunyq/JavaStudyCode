/*�ҳ����л�����
 */

//���5λ�������л�����,��ͳ���ж��ٸ�������
public class HuiWen {
	public static void main(String[] args) {
		int w,q,s,g,count = 0;
		for (int i = 10000; i<=99999; i++ ) {
			w = i/10000;
			q = i/1000%10;
			s = i/10%10;
			g = i%10;
			if (w == g && q == s) {
				System.out.println("��������"+i);
				count++;
			}
		}
		System.out.println("������������"+count);
	}
}