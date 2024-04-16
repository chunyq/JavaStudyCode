package com.teacher.stream;

import java.io.*;

/**
 * 需求1: 文件拷贝: 从info.txt中读取数据, 写入到D:/b.txt
 * 需求2: 文件拷贝: 把 info.txt中, 拷贝到D:/aaa文件夹下
 * 需求3: 文件拷贝: 把 en.webp , 拷贝到D:/aaa文件夹下
 * 1.  创建文件字节输入流
 * 创建文件字节输出流
 * 2.拷贝(循环)
 * 读取 如果没有到文件结尾
 * 写入 目标文件中
 * 3.关闭流
 */
public class CopyDemo01 {
    public static void main(String[] args) throws IOException {
        //File file = new File("F:/test/info.txt");
        File file = new File("F:/test/en.webp");

        //1.创建文件字节输入流
        FileInputStream fileInputStream = new FileInputStream(file);
        //   2.创建文件字节输出流
        FileOutputStream outputStream = new FileOutputStream("D:/aaa/" + file.getName());

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        // 3.关闭流:先关闭写的流  再关闭读的流
        outputStream.close();
        fileInputStream.close();

    }
}
