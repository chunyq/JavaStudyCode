package com.yh.buffer;

import java.io.*;

/**
 * 需求：把 F:/test/a.txt 拷贝到D盘aaa目录下
 * <p>
 * 1.  创建文件字节输入流 -->缓冲流
 * 创建文件字节输出流-->缓冲流
 * 2.拷贝(循环)
 * 读取 如果没有到文件结尾
 * 写入 目标文件中
 * 3.关闭流
 */
public class BufferCopyDemo01 {
    public static void main(String[] args) throws IOException {

        copy04();
    }

    public static void copy04() throws IOException {

        File file = new File("F:/test/info.txt");
        //1.创建文件字节输入流 -->字符缓冲流
        //2.创建文件字节输出流 -->字符缓冲流
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);

        FileWriter fileWriter = new FileWriter("D:/aaa/" + file.getName());
        BufferedWriter bw = new BufferedWriter(fileWriter);

        String s;
        while ((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();//换行
            bw.flush();//刷新
        }
        // 3.关闭流:先关闭写的流  再关闭读的流
        br.close();
        bw.close();
    }


    public static void copy03() throws IOException {

        File file = new File("F:/test/info.txt");
        //1.创建文件字节输入流
        //   2.创建文件字节输出流
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);

        FileWriter fileWriter = new FileWriter("D:/aaa/" + file.getName());
        BufferedWriter bw = new BufferedWriter(fileWriter);

        char[] chars = new char[1024];
        int len;

        while ((len = br.read(chars)) != -1) {
            bw.write(chars, 0, len);
        }

        // 3.关闭流:先关闭写的流  再关闭读的流
        br.close();
        bw.close();

    }


    public static void copy02() throws IOException {
        long startTime = System.currentTimeMillis();

        File file = new File("F:/test/a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bin = new BufferedInputStream(fileInputStream);

        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("D:/aaa/" + file.getName()));

        int i;
        byte[] bytes = new byte[1024];

        while ((i = bin.read(bytes)) != -1) {
            bout.write(bytes, 0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        bout.close();
        bin.close();
    }

    public static void copy01() throws IOException {
        File file = new File("F:/test/a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bin = new BufferedInputStream(fileInputStream);

        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("D:/aaa/" + file.getName()));

        int i;
        while ((i = bin.read()) != -1) {
            bout.write(i);
        }

        bout.close();
        bin.close();
    }


}
