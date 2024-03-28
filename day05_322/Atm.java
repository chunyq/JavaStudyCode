/*
ATM存款系统
	选项： 1.查询  2.存款  3. 取款  4. 退卡

 */
import java.util.Scanner;
public class Atm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//账户金额
		double money = 0;
		//取款金额
		double qu = 0;
		//存款金额
		double cun = 0;
		// 操作数
		int c = 0;
		while(true){
			System.out.println("=============================");
			System.out.println("======ATM存款系统=============");
			System.out.println("======请选择您的操作：=========");
			System.out.println("======1.查询余额===============");
			System.out.println("======2.存款===================");
			System.out.println("======3.取款===================");
			System.out.println("======4.退卡===================");
			System.out.print("请选择您的操作：");
			c = sc.nextInt();
			switch(c){
				case 1:
					System.out.println("您正在[查看余额]");
					System.out.println("当前余额为"+money+"元");
					break;
				case 2:
					System.out.print("请输入存款的金额：");
					cun = sc.nextDouble();
					System.out.println("您正在[存款]");
					if (cun>0) {
						money += cun;
					} else {
						System.out.println("存款金额应大于0");
					}
					System.out.println("存款完成");
					System.out.println("当前余额为"+money+"元");
					break;
				case 3:
					System.out.print("请输入取款的金额：");
					qu = sc.nextDouble();
					if (qu > 0 && qu <= money) {
						money -= qu;
						System.out.println("您正在[取款]");
						System.out.println("取款完成");
					} else if (qu > money) {
						System.out.println("余额不足");
					} else {
						System.out.println("取款金额应大于0");
					}
					System.out.println("当前余额为"+money+"元");
					break;
				case 4:
					System.out.println("退卡成功！");
					System.out.println("感谢使用ATM机，再见！");
					return ;
				default:
					System.out.println("输入有误，请重新输入！");

			}
		} 
	}
}