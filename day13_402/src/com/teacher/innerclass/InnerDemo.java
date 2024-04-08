package com.yh.innerclass;

/*
1.内部类：把一个类定义到另一个类中
	    把A定义到B类中： A内部类   B外部类
  内部类可以看成外部类的成员
2.内部类的访问：
	  内部类可以直接访问外部类的成员（包括私有属性成员）
	  在外部类中如何访问内部类中的方法: ?
	 		创建内部类对象，调用方法
3.内部类分类：
	成员内部类 ：定义在成员的位置             Outer1$Inner11.class
	        普通的：new 外部类().new 内部类()
			private 私有化，保护数据: 在方法中  new 内部类()
			static  静态化， 共享数据
			   new  外部类.内部类() .非静态方法()   ;
			   外部类.内部类.静态方法
	局部内部类：定义在局部位置,只能在方法中使用  Outer2$1Inner2.class
	         new 内部类()
	匿名内部类：直接new,没有名字的内部类（常用） Outer1$Inner11.class
            简化实现类的定义
            前提：接口  抽象类
 */
class Outer1 {
    private int num = 10;
    private static int num2 = 20;

    public void test01() {
        System.out.println("外部类--test01()");
    }

    //普通的成员内部类
    class Inner11 { // Outer1$Inner11.class
        public void show11() {
            System.out.println("内部类-11");
            System.out.println(num);
            System.out.println(num2);
        }
    }

    //私有的成员内部类:在本类方法中创建对象，调用私有内部类的方法
    private class Inner12 {
        public void show12() {
            System.out.println("内部类-12");
            System.out.println(num);
            System.out.println(num2);
        }
    }

    public void test02() {
        System.out.println("外部类--test02()");
        Inner12 inner12 = new Inner12();
        inner12.show12();
    }

    //静态内部类
    static class Inner13 {
        //非静态方法
        public void show13() {
            System.out.println("内部类-13");
            System.out.println(num2);
        }

        //静态方法
        public static void show13333() {
            System.out.println("内部类-13333");
            System.out.println(num2);
        }
    }
}

//一个源文件中可以定义多个类
// 源文件的名字需要和公共的类的名称完全一致，所以最多只能有一个公共的类
// 有多少个类，编译生成多个class文件
// 建议：一个源文件中只定义一个类
//该案例 为了方便测试，多个类写到了同一个源文件中
public class InnerDemo {
    public static void main(String[] args) {

        Outer1 outer1 = new Outer1();
        outer1.test01();
        outer1.test02();

        Outer1.Inner11 inner11 = outer1.new Inner11();
        Outer1.Inner11 inner111 = new Outer1().new Inner11();
        inner111.show11();

        //    静态内部类(非静态方法)：new 外部类.内部类()
        Outer1.Inner13 inner13 = new Outer1.Inner13();
        inner13.show13();

        //    静态内部类(静态方法)：new 外部类.内部类()
        Outer1.Inner13.show13333();

    }
}
