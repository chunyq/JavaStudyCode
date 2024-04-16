package com.teacher.stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求1: 文件拷贝: 把info.txt, 拷贝到 到D:/aaa 文件夹下
 * 1.  创建文件字符输入流
 * 创建文件字符输出流
 * 2.拷贝(循环)
 * 读取 如果没有到文件结尾
 * 写入 目标文件中
 * 3.关闭流
 * 字符流:专门原来处理文本的问题
 */
public class CopyDemo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/test/info.txt");
        //1.创建文件字节输入流
        //   2.创建文件字节输出流
        FileReader reader = new FileReader(file);
        FileWriter fileWriter = new FileWriter("D:/aaa/" + file.getName());

        char[] chars = new char[1024];

        int len;
        while ((len = reader.read(chars)) != -1) {
            fileWriter.write(chars, 0, len);
        }
        // 3.关闭流:先关闭写的流  再关闭读的流
        fileWriter.close();
        reader.close();
    }
}
