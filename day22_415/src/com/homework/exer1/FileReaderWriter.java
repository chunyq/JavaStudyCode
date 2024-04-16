package com.homework.exer1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName:FileReaderWriter
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/15 18:09
 */
public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        //创建字符型输出流：从内存写入到指定文件中
        FileWriter fWriter = new FileWriter("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\a.txt", true);
        //创建字符型输入流：从指定文件读取数据到内存
        FileReader fReader = new FileReader("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\a.txt");

        //写入数据
        char[] ch = {'x', 'y', '测'};
        fWriter.write(ch);//一次写入一个字符数组
        fWriter.write("\r\n" + "hello"); //一次写入一个字符串
        fWriter.close(); //关闭输出流并释放资源

        //读取写入的数据
        char[] chars = new char[10]; ////原来存储读取到的字符数据
        int i = fReader.read(chars); //真实读取到的字符长度
        if (i != -1) {
            System.out.println(new String(chars, 0, i));
        }
        fReader.close();
    }
}
