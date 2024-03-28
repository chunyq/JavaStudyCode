
public class ZuoYe1 {
	public static void main(String[] args) {
		/*//初始化总和
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100累加和="+sum);*/

		// 求阶乘 10!
		// 声明变量存储结果
		/*long s = 1L;
		int i = 1;
		while (i<= 10) {
			s *= i;
			i++;
		}
		System.out.println("10!="+s);*/

		//输出1~100之间的偶数
		System.out.println("输出1~100之间的偶数");
		for (int i = 1; i<=100; i++) {
			if (i % 2 == 0) {
				System.out.println("======");
				System.out.println(i);
			}
		}
	}
}