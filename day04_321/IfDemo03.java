//练习：键盘输入你的成绩:
//成绩在	90-100 区间，输出：你真优秀--奖励你一辆自行车！
//成绩在	70-90 区间，输出：成绩良好，奖励一个变形金刚！
//成绩在	60-70 区间，输出：及格了，奖励一瓶娃哈哈AD钙奶！
//成绩在	0-60  区间，输出：父母混合双打！
import java.util.Scanner;

public class IfDemo03  {
	public static void main(String[] args) {
		System.out.println("开始");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入小明的分数：");
		double s = sc.nextInt();
		// 判断
		if (s>=0 && s<=100) {
			if (s>=90) {
				System.out.println("你真优秀--奖励你一辆自行车！");
			} else if (s>=70 && s<90) {
				System.out.println("成绩良好，奖励一个变形金刚！");
			} else if (s>=60 && s<70) {
				System.out.println("及格了，奖励一瓶娃哈哈AD钙奶！");
			} else {
				System.out.println("父母混合双打！");
			}
		} else {
			System.out.println("输入有误");
		}

	}
}