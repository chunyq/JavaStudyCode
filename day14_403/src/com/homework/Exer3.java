package com.homework;

/**
 * ClassName:Exer3
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/3 17:09
 */
public class Exer3 {
    public static void main(String[] args) {
        String input = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String target = "java";

        int count = 0;
        int index = 0;

        while ((index = input.indexOf(target, index)) != -1) {
            count++;
            index += target.length(); //�ƶ����Ӵ����棬�����ظ�����
        }
        System.out.println("�����" + target + "������" + count + "��");


    }
}
