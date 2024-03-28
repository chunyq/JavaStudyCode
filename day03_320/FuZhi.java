public class FuZhi{
	public static void main(String[] args) {
		// 赋值运算符
		// += -+ *= /= %=
		byte a = 10,b = 5;
		a += b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		// += 隐藏强制类型转换
		// a+=b 并不等价于a = a+b
		// 而是a = (a的数据类型)(a+b)
		//a = a+b; 会报错，因为byte --> int
	}
}