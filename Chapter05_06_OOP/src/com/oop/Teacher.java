package com.oop;

/**
 * ClassName:Teacher
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/27 20:01
 */
/*
��ʦ��Teacher
    ����:
    ����name
    ����age
    ��������content
    ��Ϊ:
    �Է�eat()
    ����teach��String kc��
 */
public class Teacher {
    private String name;
    private int age;
    private String content;

    //���췽��
    public Teacher(){}
    public Teacher(String name,int age,String content){
        this.name = name;
        this.age = age;
        this.content = content;
    }
    //��Ա����
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat() {
        System.out.println("����Ϊ" + age + "��" + name + "��ʦ���ڳԷ�....");
    }

    public void teach(String kc) {
        System.out.println("����Ϊ"+age+"��"+name+"��ʦ���ڿ��ܵĽ���"+kc+"��֪ʶ......");
    }
}
