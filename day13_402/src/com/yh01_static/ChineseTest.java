package com.yh01_static;

/**
 * ClassName:ChineseTest
 * Package:com.yh01_static
 *
 * @Author 86183
 * @Create 2024/4/2 14:24
 */
public class ChineseTest {

}

class Chinese {
    //非静态变量(实例变量)
    String name;
    int age;

    //静态变量、类变量
    static String nation = "中国";

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
