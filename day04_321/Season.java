import java.util.Scanner;

public class Season  {
	public static void main(String[] args) {
		// 需求：使用三目运算符完成对变量月份判断输出对应季节
		Scanner sc = new Scanner(System.in);
		System.out.println("开始");
		System.out.print("请输入月份：");
		int month = sc.nextInt();
		String s = (month>12 || month<1) ? "输入有误" : 
				   (month>=3 && month<=5) ? "春季" :
			       (month>=6 && month<=8) ? "夏季" :
			       (month>=9 && month<=11) ? "秋季" : "冬季";
		System.out.println("这是在"+s);
	}
}