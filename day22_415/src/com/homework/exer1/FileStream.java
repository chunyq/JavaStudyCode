package com.homework.exer1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName:FileStream
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/15 18:01
 */
public class FileStream {
    public static void main(String[] args) throws IOException {
        //创建文件字节输出流:原来往指定文件中写入数据
        FileOutputStream outputStream = new FileOutputStream("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\hello.txt", true);
        //创建文件字节输入流从指定文件中读取数据(文件必须存在)
        FileInputStream inputStream = new FileInputStream("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\hello.txt");

        //写出数据
        String s = "Java你好";
        outputStream.write(("\r\n" + s).getBytes());

        outputStream.close();

        //读取数据
        byte[] bytes = new byte[1024];//读取到的数据存储到字节数组中
        //一次读一个字节数组,数据放到字节数组中,返回读到的字节长度
        int i = inputStream.read(bytes);//真实读取到的字节长度
        if (i != -1) {
            System.out.println(new String(bytes, 0, i));
        }

        inputStream.close();

    }
}
