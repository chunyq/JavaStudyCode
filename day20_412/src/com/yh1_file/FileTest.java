package com.yh1_file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName:FileTest
 * Package:com.yh1_file
 *
 * @Author 86183
 * @Create 2024/4/12 14:32
 */
public class FileTest {
    /*
     *   �ļ���·����ʾ��ʽ��
     * ��ʽ1������·������windows����ϵͳΪ���������̷����ڵ��ļ����ļ�Ŀ¼������·����
     * ��ʽ2�����·���������ĳһ���ļ�Ŀ¼��������Ե�λ�á�
     *          ��IDEA�У����ʹ�õ�Ԫ���Է���������ڵ�ǰ��module����
     *                   ���ʹ��main()����������ڵ�ǰ��project����
     */
    @Test
    public void test1() {
        //public File(String pathname)
        File file1 = new File("F:\\YunHeKnowledge\\javaStudyCode\\day20_412\\hello.txt");

        File file2 = new File("hello.txt");

        File file3 = new File("abc1");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file3.getAbsolutePath());
        //F:\YunHeKnowledge\javaStudyCode\day20_412\abc1
    }

    public static void main(String[] args) {
        File file4 = new File("abc1"); //�ļ�������module��
        System.out.println("����·����" + file4.getAbsolutePath());
        //����·����F:\YunHeKnowledge\javaStudyCode\abc1
        //������·��ȴ��project��
    }

    @Test
    public void test2() {
        //public File(String parent,String child)
        //����1��һ�����ļ�Ŀ¼
        //����2��������һ���ļ���Ҳ������һ���ļ�Ŀ¼
        new
    }
}
