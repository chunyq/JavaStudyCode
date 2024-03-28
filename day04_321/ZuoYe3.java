//输出100以内的偶数，并计算出偶数的和
public class ZuoYe3 {
	public static void main(String[] args) {
		// 声明存储总和的变量
		int sum = 0;
		for (int i = 1; i<100; i++ ) {
			if (i % 2 ==0) {
				sum += i;
			}
		}
		System.out.println("总和为："+sum);
	}
}
