//导包
import java.util.Scanner;

public class OuShu{
	public static void main(String[] args) {
		System.out.println("开始");
		//需求：任意输入一个整数，判断其为奇数还是偶数，并打印结果
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n = sc.nextInt();
		if (n%2 == 0){
			System.out.println(n+"是一个偶数");
		} else {
			System.out.println(n+"是一个奇数");
		}
		System.out.println("结束");
	}
}