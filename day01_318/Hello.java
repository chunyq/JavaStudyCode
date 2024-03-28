/*
说明一下public static void main(String[] args)这段声明里
每个关键字的作用
public:main方法是Java程序运行时调用的第一个方法，因此必须对Java环境可见
可见性设置为public
static：Java平台调用这个方法时不好创建这个类的一个实例，因此这个方法必须声明为static
void : main方法没有返回值
String是命令行传进参数的类型，args是指命令行传进的字符串数组
 */
public class Hello {
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}

/*
.java --> .class  --> Java运行
 */