import java.util.*;

public class SuiJi {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*10)+1;
		/*System.out.println(num);*/	
		System.out.print("请确定要猜的次数：");
		int m = sc.nextInt();
		// 计数器变量
		int count = 0;
		//所猜的数字
		int guessNum;
		for (; m>=1; m-- ) {
			System.out.println("您还有"+m+"次机会");
			//每循环一次,每猜一次,计数器+1
			count++;
			//输入一个数字
			System.out.print("请猜一个1~10的数：");
			guessNum = sc.nextInt();
			//判断这个数字和生成的随机数是否相等
			if (guessNum == num) {
				System.out.println("恭喜你,猜对了,你一共用了"+count+"次");
				break;
			} else if (guessNum > num) {
				System.out.println("你猜大了");
			} else {
				System.out.println("你猜小了");
			}
		}
		
	}
}