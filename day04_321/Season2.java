import java.util.Scanner;

public class Season2  {
	public static void main(String[] args) {
		// 需求：对变量月份判断输出对应季节
		Scanner sc = new Scanner(System.in);
		System.out.println("开始");
		System.out.print("请输入月份：");
		int month = sc.nextInt();
		// if-else判断
		if (month>=1 && month<=12) {
			if (month>=3 && month<=5) {
				System.out.println("春季");
			} else if (month>=6 && month<=8) {
				System.out.println("夏季");
			} else if (month>=9 && month<=11) {
				System.out.println("秋季");
			} else {
				System.out.println("冬季");
			}
		} else {
			System.out.println("输入有误");
		}
	}
}