package com.homework.exer2;

/**
 * ClassName:StringDemo
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/4/8 18:45
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = " ahfkjahdfkjhakjhfdkjhajfdshkjahsf ";

        //����
        System.out.println("�ַ������ȣ�" + s.length());
        //��ǰ�������
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();
        //�Ӻ���ǰ����
        for (int i = s.length() - 1; i > 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();
        //�ҳ���һ��a���ֵ�λ��
        int firstAIndex = s.indexOf('a');
        System.out.println("��һ��a���ֵ�λ��: " + firstAIndex);

        //�ҳ����һ��a���ֵ�λ��
        int lastAIndex = s.lastIndexOf('a');
        System.out.println("���һ��a���ֵ�λ��: " + lastAIndex);

        //ʵ���ַ�������ȥ���ո��ַ�
        String trimmedStr = s.trim();
        System.out.println("ȥ���ո����ַ���: " + trimmedStr);

    }
}
