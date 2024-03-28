// 自动类型转换细节
public class AutoConvert{
	public static void main(String[] args) {
		// 细节1：有多种类型的数据混合运算时
		// 系统首先自动将所有的数据转换成精度最大的那个类型
		char c1 = 'b';
		int n1 = 20;
		/*float f1 = n1+2.1;  报错 不兼容*/
		float f2 = c1 + n1 + 2.1F;
		System.out.println(f2); // 结果类型是float
		// 'b'(char)-->98.0(float) 20(int) --> 20.0(float)
		
		//细节2：当我们把精度大的类型赋值给精度小的类型时，会报错
		//反之则会进行自动类型转换
		/*int n2 = 3.14;  double --> int 错误*/

		//细节3：自动类型转换链条
		//byte,short(char) --> int -->long -->float -->double 
		//精度越来越大,boolean不参与类型转换
		//注意:byte,short和char不会相互自动转换,但是可以相互计算
		//不过计算时要先转换为int类型
		byte b1 = 1;
		byte b2 = 2;
		short s1 = 1;
		// short s2 = b1 + s1;  错误 因为b1+s1 -->int
		int s2 = b1 + s1; //对
		// byte b3 = b1+b2; 错误 b1 + b2 -->int
		
		/*byte n2 = 128;  错误 
		当给byte赋具体值时，先判断是否在byte范围(-128-127)内
		*/

	}
}