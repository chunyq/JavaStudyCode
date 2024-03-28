/*
求出三位数中所有的水仙花数,并将他们打印到控制台上.
求出所有水仙花数的和,并统计共有多少个水仙花数
 */
public class ShuiXian {
	public static void main(String[] args) {
		int g,s,b,sum = 0;
		// 标记个数
		int count = 0;
		for (int i = 100; i<=999; i++ ) {
			g = i % 10;
			s = i / 10 % 10;
			b = i / 100;
			if (g*g*g + s*s*s + b*b*b == i) {
				System.out.println("三位数的水仙花数："+i);
				sum += i;
				count++;
			}
		}
		System.out.println("三位数的水仙花数总和："+sum);
		System.out.println("三位数的水仙花数个数："+count);
	}
}