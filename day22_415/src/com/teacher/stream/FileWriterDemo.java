package com.teacher.stream;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //1.创建文件字符输出流:写入数据
        FileWriter fileWriter = new FileWriter("F:/test/dd.txt");
        //2.写入数据
        fileWriter.write('a'); //一次写入一个字符
        fileWriter.flush();//刷新
        fileWriter.write('中');
        fileWriter.flush();//刷新
        char[] ch = {'x', 'y', '测'};
        fileWriter.write(ch);//一次写入一个字符数组
        fileWriter.close();

        fileWriter.write("helloworld");//一次写入一个字符串
        //3.释放资源
        fileWriter.close();
    }
}
