/*
需求
声明变量pwd并赋值，作为你的密码；		
	在控制台输入密码，共有三次机会；
	如果输入正确，则提示登录成功；
	如果输入错误，则提示您还有2 次机会，1次机会；
	如果三次都输错，提示：密码错误，请联系管理员

	 * 提示需要用到Scanner类；
	 * 成功的时候，需要用到break;
	 * 还需要用到循环；
 */
import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//密码
		String pwd = "123456";
		//输入次数
		int c = 3;
		String guessPwd = "";
		while (c >= 1) {
			System.out.print("请输入密码(共有三次机会):");
			guessPwd = sc.next();
			c--;
			if (guessPwd.equals(pwd)) {
				System.out.println("登录成功！");
				break;
			} else {
				if (c == 0) {
					break;
				}
				System.out.println("输入错误,您还有"+c+"次机会");
			}
		}
		if (c == 0) {
			System.out.println("密码错误，请联系管理员");
		}
		
	}
}