
public class ForDemo1  {
	public static void main(String[] args) {
		//��ӡ1-100֮������ż��
		/*for (int i = 0; i<100; i++ ) {
			if (i % 2 == 0) {
				System.out.println("ż����"+i);
			}
		}*/

		/*for (int i = 10; i>=0; i-- ) {
			System.out.println(i);
		}*/

		// ��ӡ1+2+3+...+100
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1+2+3+...+100="+sum);
	}
}