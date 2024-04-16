package com.homework;

import java.io.*;

/**
 * ClassName:Exer2
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/15 19:18
 */
public class Exer2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1、创建相关的File类对象
            File src = new File("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\play.png");
            File dest = new File("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\play_copy.png");
            //2、创建相关字节流
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);

            //3、数据的读取和写入
            byte[] buffer = new byte[1024];
            int len; //记录每次读入到buffer中字节的个数
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
