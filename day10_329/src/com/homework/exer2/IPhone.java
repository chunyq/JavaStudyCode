package com.homework.exer2;

/**
 * ClassName:IPhone
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/3/29 18:54
 */
/*
�̳г����� Phone
    ���췽���������ղι�������ι��췽��(String)
    ��д���󷽷���
    void btFunction()��Ҫ�����"֧��WIFI����"
     name����ֵ
 */
public class IPhone extends Phone {

    public IPhone() {
    }

    public IPhone(String name) {
        super(name);
    }



    @Override
    public void btFunction() {
        System.out.println("֧��WIFI����");
    }


}
