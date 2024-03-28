//导包
import java.util.Scanner;

public class IfDemo02{
	public static void main(String[] args) {
		System.out.println("开始");
		Scanner sc = new Scanner(System.in);
		// 需求:键盘录入一个星期数(1,2...,7)
		// 输出对应的星期一、星期二。。。。星期日
		System.out.print("请输入星期数(1,2...,7):");
		int n = sc.nextInt();
		if(n == 1){
			System.out.println("星期一");
		} else if(n == 2){
			System.out.println("星期二");
		} else if (n == 3) {
			System.out.println("星期三");
		} else if (n == 4) {
			System.out.println("星期四");
		} else if (n == 5) {
			System.out.println("星期五");
		} else if (n == 6) {
			System.out.println("星期六");
		} else if (n == 7) {
			System.out.println("星期日");
		}
		System.out.println("结束");
	}
}