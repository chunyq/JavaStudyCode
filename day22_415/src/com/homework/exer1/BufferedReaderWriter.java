package com.homework.exer1;

import java.io.*;

/**
 * ClassName:BufferedReaderWriter
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/15 19:04
 */
public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {

        testBufferedWriter();
        testBufferedReader();
    }

    public static void testBufferedReader() throws IOException {
        FileReader fileReader = new FileReader("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\a.txt");
        BufferedReader br = new BufferedReader(fileReader);

        char[] chars = new char[1024];
        System.out.println(new String(chars, 0, br.read(chars)));

        br.close();
    }

    public static void testBufferedWriter() throws IOException {
        FileWriter fileWriter = new FileWriter("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\a.txt");
        BufferedWriter bw = new BufferedWriter(fileWriter);

        //写入数据
        bw.write("hello");
        bw.newLine(); //换行
        bw.write(new char[]{'我', '要', '拿', '高', '薪'});

        bw.close();
    }
}
