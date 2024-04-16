package com.homework;

import java.io.*;

/**
 * ClassName:Exer4
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/15 19:47
 */
//字节缓冲流
public class Exer4 {
    public static void main(String[] args) throws IOException {
        //创建节点流
        FileInputStream inputStream = new FileInputStream("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\meeting_01.mp4");
        FileOutputStream outputStream = new FileOutputStream("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\meeting_copy.mp4");

        //封装节点流为缓冲流
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);

        //数据的读取和写入
        byte[] buffer = new byte[2048];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        System.out.println("复制成功");

        //关闭流
        bos.close();
        bis.close();
    }
}
