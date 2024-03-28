/*找出所有回文数
 */

//输出5位数的所有回文数,并统计有多少个回文数
public class HuiWen {
	public static void main(String[] args) {
		int w,q,s,g,count = 0;
		for (int i = 10000; i<=99999; i++ ) {
			w = i/10000;
			q = i/1000%10;
			s = i/10%10;
			g = i%10;
			if (w == g && q == s) {
				System.out.println("回文数："+i);
				count++;
			}
		}
		System.out.println("回文数个数："+count);
	}
}