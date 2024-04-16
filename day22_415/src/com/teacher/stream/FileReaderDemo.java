package com.teacher.stream;

import java.io.FileReader;
import java.io.IOException;

/**
 * 1个  中文:   UTF-8  3字节
 * GBK    2字节
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建文件字符输入流:读取数据
        FileReader fileReader = new FileReader("F:/test/a.txt");
/*
        int i = fileReader.read();// 每次读取一个字符,文件结尾-1
        System.out.println((char) i);

        i = fileReader.read();
        System.out.println((char) i);

        i = fileReader.read();
        System.out.println((char) i);

        i = fileReader.read();
        System.out.println( i);
*/
        char[] chars = new char[10];//原来存储读取到的字节数据
        int i = fileReader.read(chars);//真实读取到的字符个数
        System.out.println(i);
        //System.out.println(new String(chars));
        System.out.println(new String(chars, 0, i));

        //释放资源
        fileReader.close();


    }
}
