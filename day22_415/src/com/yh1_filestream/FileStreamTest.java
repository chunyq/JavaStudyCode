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
//字节流
public class FileStreamTest {
    /*
    复制一份play.png的图片文件，命名为play_copy.png
    复制视频也是一样
     */
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1、创建相关的File类对象
            File src = new File("play.png");
            File desc = new File("play_copy.png");

            //2、创建相关的字节流
            fis = new FileInputStream(src);
            fos = new FileOutputStream(desc);

            //3、数据的读入和写出
            byte[] buffer = new byte[1024]; //1kb
            int len; //记录每次读入到buffer中字节的个数
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、关闭资源
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
        复制一份hello.txt文件，命名为hello_copy1.txt
        使用字节流实现文本文件的复制
     */
    @Test
    public void test2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1、创建相关的File类的对象
            File srcFile = new File("hello.txt");
            File destFile = new File("hell_copy1.txt");

            //2、创建相关的字节流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3、数据的读入和写出
            byte[] buffer = new byte[1024];
            int len;//记录每次读入到buffer中字节的个数
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、关闭资源
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
        读取hello.txt,将数据显示在控制台上
     */
    @Test
    public void test3() {
        FileInputStream fis = null;
        try {
            File src = new File("hello.txt");

            fis = new FileInputStream(src);

            byte[] bytes = new byte[1024];
            int len; //记录每次读入到bytes中字节的个数
            if ((len = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            System.out.println("复制成功");
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
       将特定的数据写出到hell_copy1.txt
     */
    @Test
    public void test4() {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;

    }

}
