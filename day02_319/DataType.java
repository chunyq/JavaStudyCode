public class DataType{
	public static void main(String[]args){
		
		//变量的定义
		//格式一： 数据类型 变量名 = 初始化值; // 声明变量并赋值
		int i=18;	
		int age=21;

		System.out.println(i);
		System.out.println("i");
		System.out.println("age:::"+age);
		
		/* 先声明，后赋值（使用前赋值即可）
			数据类型 变量名;
			变量名 = 初始化值;
			
			错误: 可能尚未初始化变量x:没有赋值
			
			必须先声明，再赋值，最后才能使用
		*/
		
		int x;
		x=112;
		System.out.println("x="+x);
		
		//声明多个数据类型相同的变量
		//格式三： 数据类型 变量名 = 值,变量名 = 值, ....;
		/*
			int q=11;
			int w=22;
			int e=33;
		*/
		int q=11,w=22,e=33,d;
		d=44;
		
		System.out.println("e="+e);
		System.out.println("d="+d);
				
	}
}