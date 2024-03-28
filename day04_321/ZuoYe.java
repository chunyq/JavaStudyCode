import java.util.Scanner;

public class ZuoYe  {
	public static void main(String[] args) {
		//1、键盘输入一个整用来表示月份，输出 这个月份有多少天
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入月份：");
		int month = sc.nextInt();
		//if-else
		/*if (month<=12 && month>=1) {
			if (month == 1|| month == 3 || month == 5 || 
				month == 7 || month ==8 || month == 10 
				|| month ==12) {
				System.out.println(month+"月份有31天");
			} else if (month == 2 ) {
				System.out.println(month+"月份有28天或29天");
			} else {
				System.out.println(month+"月份有30天");
			}
		} else {
			System.out.println("输入有误");
		}*/

		//1、键盘输入一个整用来表示月份，输出 这个月份有多少天
		//switch
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"月份有31天");
				break;
			case 2:
				System.out.println(month+"月份有28天或29天");
				break;
			case 4,6,9,11:
				System.out.println(month+"月份有30天");
				break;
			default:
				System.out.println("输入有误");
				break;
		}
	}
}