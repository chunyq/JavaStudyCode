package com.homework.exer1;

import java.io.*;

/**
 * ClassName:BufferedXXStream
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/15 18:52
 */
public class BufferedXXStream {
    public static void main(String[] args) throws IOException {
        testBufferedOutputStream();
        testBufferedInputStream();
    }

    public static void testBufferedOutputStream() throws IOException {
        //1、创建节点流
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\a.txt");
        //2、封装节点流为缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
        //写入数据
        bos.write("Java你好".getBytes());
        //关闭流
        bos.close();
    }

    public static void testBufferedInputStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);

        //读取数据
        byte[] bytes = new byte[1024];
        int len = bis.read(bytes); //长度
        System.out.println(new String(bytes, 0, len));

        bis.close();
    }
}
