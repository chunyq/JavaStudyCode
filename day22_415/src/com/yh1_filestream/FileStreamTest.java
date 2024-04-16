package com.yh1_filestream;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * ClassName:FileStreamTest
 * Package:com.yh1_filestream
 *
 * @Author 86183
 * @Create 2024/4/15 10:52
 */
//�ֽ���
public class FileStreamTest {
    /*
    ����һ��play.png��ͼƬ�ļ�������Ϊplay_copy.png
    ������ƵҲ��һ��
     */
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1��������ص�File�����
            File src = new File("play.png");
            File desc = new File("play_copy.png");

            //2��������ص��ֽ���
            fis = new FileInputStream(src);
            fos = new FileOutputStream(desc);

            //3�����ݵĶ����д��
            byte[] buffer = new byte[1024]; //1kb
            int len; //��¼ÿ�ζ��뵽buffer���ֽڵĸ���
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("���Ƴɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4���ر���Դ
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
        ����һ��hello.txt�ļ�������Ϊhello_copy1.txt
        ʹ���ֽ���ʵ���ı��ļ��ĸ���
     */
    @Test
    public void test2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1��������ص�File��Ķ���
            File srcFile = new File("hello.txt");
            File destFile = new File("hell_copy1.txt");

            //2��������ص��ֽ���
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3�����ݵĶ����д��
            byte[] buffer = new byte[1024];
            int len;//��¼ÿ�ζ��뵽buffer���ֽڵĸ���
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("���Ƴɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4���ر���Դ
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
        ��ȡhello.txt,��������ʾ�ڿ���̨��
     */
    @Test
    public void test3() {
        FileInputStream fis = null;
        try {
            File src = new File("hello.txt");

            fis = new FileInputStream(src);

            byte[] bytes = new byte[1024];
            int len; //��¼ÿ�ζ��뵽bytes���ֽڵĸ���
            if ((len = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            System.out.println("���Ƴɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
       ���ض�������д����hell_copy1.txt
     */
    @Test
    public void test4() {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;

    }

}
