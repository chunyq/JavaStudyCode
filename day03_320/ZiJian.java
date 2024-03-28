public class ZiJian{
	public static void main(String[] args) {
		int i = 10;
		i++; // 单独使用
		System.out.println("i:" + i); // i:11

		int j = 10;
		++j; // 单独使用
		System.out.println("j:" + j); // j:11

		int x = 10;
		int y = x++; // 赋值运算，++在后边，所以是使用x原来的值赋值给y，x本身自增1
		System.out.println("x:" + x + ", y:" + y); // x:11，y:10

		int m = 10;
		int n = ++m; // 赋值运算，++在前边，所以是使用m自增后的值赋值给n，m本身自增1
		System.out.println("m:" + m + ", m:" + m); // m:11，m:11

		int a = 10,b;
		b = (++a)+(a--)+(a++);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}