/*
1、在同一对大括号里，变量名不能重复
2、变量在使用之前，必须初始化，即赋值
 */

public class ZhuYi{
	public static void main(String[] args) {
		/* 3、定义long类型时，需要在值后面加L，整数的默认类型是int类型
		整数太大会超出int范围
			4、定义float类型的变量时，需要在小数的后面加F（大小写均可，建议大写）。因为浮点数的默认类型是double，
			 double的取值范围是大于float的，小范围不兼容大范围。
		*/
	
		long a = 23L;
		float b = 5.78F;
		System.out.println(a);
		System.out.println(b);
	}
}