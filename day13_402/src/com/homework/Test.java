package com.homework;

/**
 * ClassName:Test
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/2 19:10
 */
public class Test {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        //���ѧ��1
        System.out.println("���ѧ��1");
        studentDao.add();
        //���ѧ��2
        System.out.println("���ѧ��2");
        studentDao.add();
        //��ѯ
        studentDao.select();
        //�ж�����ѧ�������Ƿ����
        Student s1 = studentDao.students[0];
        Student s2 = studentDao.students[1];
        if (s1.equals(s2)) {
            System.out.println("����ͬѧ����Ϣ��ͬ");
        } else {
            System.out.println("����ͬѧ����Ϣ��ͬ");
        }


    }
}
