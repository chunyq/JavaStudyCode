package com.homework.exer3;

/**
 * ClassName:StudentTest
 * Package:com.homework.exer3
 *
 * @Author 86183
 * @Create 2024/4/8 20:46
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("����", 17, '��', 90),
                new Student("����", 16, 'Ů', 85),
                new Student("����", 18, '��', 88),
                new Student("����", 15, 'Ů', 92),
                new Student("�ܽ�", 17, '��', 89)
        };

        // ��1�����ѯ�Ƿ����"����"ͬѧ��
        boolean containsZhangSan = false;
        for (Student student : students) {
            if (student.getName().equals("����")) {
                containsZhangSan = true;
                break;
            }
        }
        System.out.println("�Ƿ����������" + containsZhangSan);

        // ��2�����ҳ�����δ�����ѧ��
        System.out.println("δ�����ѧ����");
        for (Student student : students) {
            if (student.getAge() < 18) {
                System.out.println(student);
            }
        }

        // ��3�����г�����Ů��������
        System.out.println("Ů��������");
        for (Student student : students) {
            if (student.getSex() == 'Ů') {
                System.out.println(student.getName());
            }
        }

        // ��4�����"�ܽ�"ͬѧ�������޸�Ϊ���ܽ��ס���Ȼ���ӡ���ѧ����������Ϣ
        for (Student student : students) {
            if (student.getName().equals("�ܽ�")) {
                student.setName("�ܽ���");
                System.out.println("�޸ĺ��ѧ����Ϣ��" + student);
                break;
            }
        }

    }
}
