
public class ZuoYe1 {
	public static void main(String[] args) {
		/*//��ʼ���ܺ�
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100�ۼӺ�="+sum);*/

		// ��׳� 10!
		// ���������洢���
		/*long s = 1L;
		int i = 1;
		while (i<= 10) {
			s *= i;
			i++;
		}
		System.out.println("10!="+s);*/

		//���1~100֮���ż��
		System.out.println("���1~100֮���ż��");
		for (int i = 1; i<=100; i++) {
			if (i % 2 == 0) {
				System.out.println("======");
				System.out.println(i);
			}
		}
	}
}