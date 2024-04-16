package com.teacher.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {//大的异常.包含小的异常

        //FileOutputStream outputStream = new FileOutputStream("F:/test/a.txt");

        File file = new File("F:/test/a.txt");
        //1.创建文件字节输出流:原来往指定文件中写入数据
        //FileOutputStream outputStream = new FileOutputStream(file);
        FileOutputStream outputStream = new FileOutputStream(file, true);
 /*       //2.写入数据
        // 单个字节
        outputStream.write('a');//int
        outputStream.write(98);//int
        outputStream.write('c');//int
*/
        String s = "你好,java\r\n";
        //byte[] bytes = s.getBytes();
        byte[] bytes = new byte[]{97, 98, 99, 100, 101, 102, 103};
        //字节数组
        outputStream.write(s.getBytes());
        outputStream.write(bytes);
        outputStream.write("\r\n".getBytes());
        //字节数组 区间写入
        outputStream.write(bytes, 1, 4);
        System.out.println("=====");

        //3.关闭IO 释放资源
        outputStream.close();

    }
}
