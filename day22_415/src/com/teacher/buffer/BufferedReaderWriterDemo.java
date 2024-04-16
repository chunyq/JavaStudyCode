package com.teacher.buffer;


import java.io.*;

/**
 * @Author yh
 * @create 16:00
 */
public class BufferedReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        //testBufferedWriter();

        testBufferedReader();
    }

    public static void testBufferedWriter() throws IOException {
        //    1.创建基本流(节点流)
        FileWriter fileWriter = new FileWriter("F:/test/hh.txt");
        //    2.封装节点流为缓冲流
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //    3.写入数据
        bufferedWriter.write('a');
        bufferedWriter.newLine();//换行
        bufferedWriter.write(new char[]{'a', '测', '试'});
        bufferedWriter.newLine();
        bufferedWriter.write(new char[]{'a', '测', '试'}, 0, 2);
        bufferedWriter.write("\r\nhello,java");
        //bufferedWriter.newLine();
        //    4.关闭流
        bufferedWriter.close();
    }

    public static void testBufferedReader() throws IOException {
        //    1.创建基本流(节点流)
        FileReader fileReader = new FileReader("F:/test/a.txt");
        //    2.封装节点流为缓冲流
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //    3.读取数据
        //int i = bufferedReader.read();//读取一个字符数据

    /*    char[] chars = new char[1024];
        int i = bufferedReader.read(chars);//读取一个字符数组
        System.out.println( new String(chars,0,i));
*/

        String s = bufferedReader.readLine();
        System.out.println(s);

        s = bufferedReader.readLine();//null:文件结尾
        System.out.println(s);
        //    4.关闭流
        bufferedReader.close();
    }
}
