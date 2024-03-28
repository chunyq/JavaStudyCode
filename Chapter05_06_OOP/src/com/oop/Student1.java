package com.oop;

/**
 * ClassName:Student
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 15:22
 */
public class Student1 {
    //定义属性(成员变量)和行为(方法)
    //属性(状态信息)：学号、姓名、年龄、性别、是否成年
    //行为(功能):学习、唱歌、吃饭
    //没有给成员变量赋值时，保持默认值，即是缺省值
    private String num;
    private String name;
    private byte age;
    private char sex;
    private boolean isAdult;

    //空构造方法(构造器)
    public Student1() {
    }

    //有参构造方法
    //创建(new)对象时可以初始化成员变量
    public Student1(String num, String name, byte age, char sex, boolean isAdult) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.isAdult = isAdult;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public void teach() {
        System.out.println("好好学习");
    }

    public void sing() {
        System.out.println("唱歌");
    }

}
