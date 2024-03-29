package com.homework.exer2;

/**
 * ClassName:IPhone
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/3/29 18:54
 */
/*
继承抽象类 Phone
    构造方法包括：空参构造和满参构造方法(String)
    重写抽象方法：
    void btFunction()，要求：输出"支持WIFI功能"
     name属性值
 */
public class IPhone extends Phone {

    public IPhone() {
    }

    public IPhone(String name) {
        super(name);
    }



    @Override
    public void btFunction() {
        System.out.println("支持WIFI功能");
    }


}
