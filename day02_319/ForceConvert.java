// ǿ������ת��
public class ForceConvert{
	public static void main(String[] args) {
		//ǿתֻ������Ĳ�������Ч������ʹ��С�����������ȼ�
		/*int x = (int)10*3.5+8*4.5; ������� double --> int*/
		int x = (int)(10*3.5+8*4.5);
		System.out.println(x);
		short s = 12; //ok
		/*s = s-9; ������� s-9�Զ�ת��Ϊint���� int --> short*/
		s = (short)(s-9);
		System.out.println(s);


		// char �����ܱ���Int�ĳ���ֵ��ȴ���治��int�ı���ֵ����Ҫǿת
		char c = 97;
		int n = 97;
		/*char c2 = n; ������� int --> char*/
		char c2 = (char)n;
		System.out.println(c);  //a
		System.out.println(n);  // 97
		System.out.println(c2);
	}
}