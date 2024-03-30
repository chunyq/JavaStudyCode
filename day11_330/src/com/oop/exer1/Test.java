package com.oop.exer1;

/**
 * ClassName:Tongji
 * Package:com.oop.exer1
 *
 * @Author 86183
 * @Create 2024/3/30 10:31
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat("红烧肉");
        Person person = new Person("213213", "张三", '男', new String[]{"唱跳rap"},
                new Phone("小米", 1234567890));
        Account a = new Account("中国银行",123,123456,2500);
        person.phone.call();
        person.phone.message();
        person.oper(a);


    }
}
