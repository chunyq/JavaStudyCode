package com.teacher.generictype;

/**
 * @Author yh
 * @create 10:54
 */
//1.泛型定义在类上,创建对象时确定类型
public class RawType<T> {
    String name;
    int age;
    T sex;

    public void test01(int i) {
        System.out.println(i);
    }

    public void test01(String i) {
        System.out.println(i);
    }

    public T show(T i) {
        System.out.println(i);
        return i;
    }
}

// 2.泛型定义在方法上
class RawType2 {
    public void test01(int i) {
        System.out.println(i);
    }

    public <T> T show(T i) {
        System.out.println(i);
        return i;
    }
}

//3 泛型定义到接口 上
interface RawType3<T> {
    void show(T t);
}

//3.1.实现接口时具体确定泛型的类型
class A implements RawType3<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}

//3.2.创建实现类对象时 具体确定类型
class B<T> implements RawType3<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}



