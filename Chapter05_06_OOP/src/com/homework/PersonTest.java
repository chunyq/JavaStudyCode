package com.homework;

/**
 * ClassName:PersonTest
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:04
 */
/*
���������:�����������󴴽��������(�ֱ�ʹ�ÿղκ�����).
����-35    С��-23
ͨ����������,�Ƚ�˭�������,����ӡ����.
��:  ��������Ƚϴ�
 */
public class PersonTest {
    public static void main(String[] args) {
        //�ղ�
        Person p1 = new Person();
        p1.setName("����");
        p1.setAge(35);
        //����
        Person p2 = new Person("С��", 23);

        //�Ƚ�����
        if (p1.getAge() > p2.getAge()) {
            System.out.println(p1.getName() + "����Ƚϴ�");
        } else {
            System.out.println(p2.getName() + "����Ƚϴ�");
        }
    }
}
