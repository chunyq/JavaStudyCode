import java.util.Scanner;

public class Season3  {
	public static void main(String[] args) {
		// 需求：使用三目运算符完成对变量月份判断输出对应季节
		Scanner sc = new Scanner(System.in);
		System.out.println("开始");
		System.out.print("请输入月份：");
		int month = sc.nextInt();
		// if-else判断
		/*if (month>=1 && month<=12) {
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
		}*/

		// switch-case 判断
		// 利用case的穿透性
		/* 在 switch 语句中，如果 case 的后面不写 break，将出现穿透现象，也就是一旦
		匹配成功，不会在判断下一个 case 的值，直接向后运行，直到遇到 break 或者
		整个 switch 语句结束，执行终止。 */
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("输入有误！");
				break;
		}
			
	}
}