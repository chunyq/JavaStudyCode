public class ZiJian{
	public static void main(String[] args) {
		int i = 10;
		i++; // ����ʹ��
		System.out.println("i:" + i); // i:11

		int j = 10;
		++j; // ����ʹ��
		System.out.println("j:" + j); // j:11

		int x = 10;
		int y = x++; // ��ֵ���㣬++�ں�ߣ�������ʹ��xԭ����ֵ��ֵ��y��x��������1
		System.out.println("x:" + x + ", y:" + y); // x:11��y:10

		int m = 10;
		int n = ++m; // ��ֵ���㣬++��ǰ�ߣ�������ʹ��m�������ֵ��ֵ��n��m��������1
		System.out.println("m:" + m + ", m:" + m); // m:11��m:11

		int a = 10,b;
		b = (++a)+(a--)+(a++);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}