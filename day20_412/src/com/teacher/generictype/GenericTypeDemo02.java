package com.teacher.generictype;

/**
 * 泛型:广泛的数据类型,可以表示任意引用数据类型(使用时具体确定一种类型,如果没有指定,默认为Object类型)
 * 泛型是数据类型的一部分，我们将类名与泛型合并一起看做数据类型
 * <p>
 * - 泛型：可以在类或方法中预支地使用未知的类型。
 * <p>
 * tips:一般在创建对象时，将未知的类型确定具体的类型。当没有指定泛型时，默认类型为Object类型。
 * <p>
 * 好处:
 * 1.解决黄色警告问题
 * 2.将运行期可能遇到的问题转移到编译期
 * 3.灵活定义(使用)数据类型
 * 使用:
 * 泛型的定义:
 * 1.泛型定义在类上:
 * 创建对象时确定类型
 * 2.泛型定义到方法上:
 * 调用方法时确定类型:
 * 根据参数自动推断匹配类型
 * 3 泛型定义到接口 上
 * 3.1.实现接口时具体确定泛型的类型
 * 3.2.创建实现类对象时 具体确定类型
 */
public class GenericTypeDemo02 {
    public static void main(String[] args) {
        //1.泛型定义在类上,创建对象时确定类型
        //如果没有指定类型Object
        RawType type = new RawType();
        type.show(11);
        type.name = "jack";
        type.sex = "男生";

        RawType<Character> type1 = new RawType<>();
        type1.show('x');
        RawType<String> type2 = new RawType<>();
        type2.show("kkk");

        //	=====2.泛型定义在方法上
        RawType2 rawType2 = new RawType2();
        rawType2.test01(11);

        rawType2.show(11);
        String jack = rawType2.show("jack");
        Boolean show = rawType2.show(true);


        //3 泛型定义到接口 上
        A a = new A();
        a.show("xx");


        B<Long> b = new B<>();
        b.show(123L);

        new B<String>().show("");


    }
}