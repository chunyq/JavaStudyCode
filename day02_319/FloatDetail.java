/**
 * @author Yang Zuqiang
 * @version 1.0
 */
public class FloatDetail{
	public static void main(String[] args) {
		//声明float型常量，须在其后放F
		float n1 = 1.1F;
		double n2 = 2.3;
		double n3 = .234; //等价0.234
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(5.12e2); //512.0
		System.out.println(5.12E-2); //0.0512

		//浮点数使用陷阱
		double n4 = 2.7;
		double n5;
		n5 = 8.1/3;
		System.out.println(n4);
		System.out.println(n5); //接近2.7的小数，不是2.7

		/*
		这种现象是由于浮点数的精度问题导致的。
		在计算机中，浮点数的表示是有限的，无法准确地表示所有的实数。
		因此，在进行浮点数计算时，可能会出现一些舍入误差。
		 */
		// 要判断两个浮点数是否相等，不应用十进制的方法直接比较，
		// 应该是以两个数的差值的绝对值，在某个精度进行判断
		// 错误写法
		/*if(n4 == n5){
			System.out.println("相等");
		}*/


		// 正确写法
		if(Math.abs(n4 - n5)<0.00000001){
			System.out.println("差值非常小。到我的规定精度，认为相等");
		}
	}
}