// 强制类型转换
public class ForceConvert{
	public static void main(String[] args) {
		//强转只对最近的操作数有效，网文使用小括号提升优先级
		/*int x = (int)10*3.5+8*4.5; 编译错误 double --> int*/
		int x = (int)(10*3.5+8*4.5);
		System.out.println(x);
		short s = 12; //ok
		/*s = s-9; 编译错误 s-9自动转换为int类型 int --> short*/
		s = (short)(s-9);
		System.out.println(s);


		// char 类型能保存Int的常量值，却保存不了int的变量值，需要强转
		char c = 97;
		int n = 97;
		/*char c2 = n; 编译错误 int --> char*/
		char c2 = (char)n;
		System.out.println(c);  //a
		System.out.println(n);  // 97
		System.out.println(c2);
	}
}