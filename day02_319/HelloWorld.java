//公共的 类   类名
public class HelloWorld{
	//公共的 静态的 空的 主方法(字符串数组 数组名)
	public static void main(String[]args){
		//系统 输出 打印 
		System.out.print("HelloWorld-\n这是\n我的\n第一个Java程序\n");//这是单行注释
		
		//System.out.println("测试");
		/*
			System.out.print("HelloWorld-\t姓名：张三\t性别：男\t爱好：女");	
			System.out.println("测试--2");
		*/
	}
}

/*
注释：注释是对代码的解释和说明文字，可以提高程序的可读性，因此在程序中添加必要的注释文字十分重要
三种注释：
	1.单行注释：//
	2.多行注释
	3.文档注释
	

println:输出之后换行
\n 换行
\t 制表键 缩进对齐

开发步骤：
	1.编写了源文件
	2.编译  javac A.java -->A.class 字节码文件/类文件
	3.运行  java A
解析：
	定义一个类
	定义一个主方法
	输出打印
	
常见错误：
	错误: 非法字符: '\uff1b'  		--中文符号
	错误: 解析时已到达文件结尾 : 	-- {}
	错误: 找不到符号    			--String写错了
	错误: 程序包system不存在 ：		--System写错了

	错误: 在类 HelloWorld 中找不到 main 方法, 请将 main 方法定义为:
	   public static void main(String[] args)
	否则 JavaFX 应用程序类必须扩展javafx.application.Application  

		-- 主方法有问题,检查主方法名 必须是main
总结：		
1. ==大小写问题。Java语言对大小写敏感（区分大小写）==    
2. ==非法字符问题。Java中的符号都是英文格式的==
3. ==在系统中显示文件的扩展名，避免出现HelloWorld.java.txt文件==
4. ==编译命令后的java文件名需要带文件后缀.java==
5. ==运行命令后的class文件名（类名）不带文件后缀.class==
*/