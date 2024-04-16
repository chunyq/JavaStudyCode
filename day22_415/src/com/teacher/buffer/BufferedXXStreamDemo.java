package com.teacher.buffer;


import java.io.*;

/**
 * @Author yh
 * @create 16:00
 */
public class BufferedXXStreamDemo {
    public static void main(String[] args) throws IOException {
        testBufferedOutputStream();

    }

    public static void testBufferedOutputStream() throws IOException {
        //    1.创建基本流(节点流)
        FileOutputStream outputStream = new FileOutputStream("F:/test/cc.txt");
        //    2.封装节点流为缓冲流
        BufferedOutputStream bout = new BufferedOutputStream(outputStream);

        //    3.写入数据
        bout.write('a');
        bout.write("\r\n你好,java".getBytes());
        bout.write("\r\n你好,java".getBytes(), 0, 8);
        //    4.关闭流
        bout.close();
    }

    public static void testBufferedInputStream() throws IOException {
        //    1.创建基本流(节点流)
        FileInputStream inputStream = new FileInputStream("F:/test/a.txt");
        //    2.封装节点流为缓冲流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        //    3.读取数据
        //    int i = bufferedInputStream.read();//读取一个字节

        byte[] bytes = new byte[1024];
        int i = bufferedInputStream.read(bytes);//长度

        System.out.println(new String(bytes, 0, i));

        //    4.关闭流
        bufferedInputStream.close();
    }
}
