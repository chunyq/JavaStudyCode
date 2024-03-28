/*
功能描述：模拟计算器功能，对定义的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
要求：
(1)定义三个变量,其中前两个整数代表参加运算的数据，
第三个整数为要进行的运算
(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
(2)使用今天所学知识 switch case 完成功能
(3)演示格式如下:
	第一个整数:30
	第二个整数:40
	您要进行的运算是加法运算
	30+40=70
 */

import java.util.Scanner;

public class ZuoYe2 {
	public static void main(String[] args) {
		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);
		System.out.print("第一个整数：");
		double n1 = sc.nextDouble();
		System.out.print("第二个整数：");
		int n2 = sc.nextInt();
		System.out.print("您要进行的运算是(0:表示加法,1:表示减法,2:表示乘法,3:表示除法)：");
		int c = sc.nextInt();
		// switch分支开始判断运算
		switch(c){
			case 0:
				System.out.println("您要进行的运算是加法运算");
				System.out.print((int)n1+"+"+n2+"="+((int)n1+n2));
				break;
			case 1:
				System.out.println("您要进行的运算是减法运算");
				System.out.print((int)n1+"-"+n2+"="+((int)n1-n2));
				break;
			case 2:
				System.out.println("您要进行的运算是乘法运算");
				System.out.print((int)n1+"*"+n2+"="+((int)n1*n2));
				break;
			case 3:
				System.out.println("您要进行的运算是除法运算");
				if (n2 == 0) {
					System.out.println("除数不能为0,请重新输入");
				} else {
					System.out.print((int)n1+"/"+n2+"="+(n1/n2));
				}
				break;
		}
	}

}