public class DataType2{
	public static void main(String[]args){
		
		byte b=10;
		b=11;
		b=127;//-128  127
		System.out.println("b="+b);
		
		short sh=1111;
		System.out.println("sh="+sh);
		
		//整数 默认 int类型
		int in=233456789;
		System.out.println("in="+in);
		
		// long 类型的数据 L/l
		long lo=13203820569L;
		lo=123;
		lo=12L;
		System.out.println("lo="+lo);
		
		// 浮点类型默认 是double
		double d=12.3;
		d=12;
		d=123456789.9876543211234d;
		System.out.println("d="+d);
		
		// float 需要加F/f
		float f=12.3f;
		f=123456789.9876543211234f;
		System.out.println("f="+f);
		
		//字符类型 '' 有且仅有一个字符
		char cc='a';
		cc='中';
		cc='*';
		cc=' ';
		cc='x';
		System.out.println("cc="+cc);
		
		//布尔类型：值只能是true/false
		boolean bb=true;
		bb=false;
		System.out.println("是否成年："+bb);
		
		// String:不是基本数据类型  是引用类中中的类类型
		//String：字符串类	
		String str="你好，我是字符串";
		System.out.println("str："+str);
		
		String d2="xxx";
	
	}
}