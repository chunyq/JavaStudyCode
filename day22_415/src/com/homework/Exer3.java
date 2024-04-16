package com.homework;

import java.io.*;

/**
 * ClassName:Exer3
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/15 19:35
 */
public class Exer3 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1、创建File类对象
            File src = new File("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\a.txt");
            File dest = new File("F:\\YunHeKnowledge\\javaStudyCode\\day22_415\\b.txt");
            //2、创建相关字符流
            fr = new FileReader(src);
            fw = new FileWriter(dest);

            //3、数据的读入与写出
            char[] chars = new char[1024];
            int len; //记录每次读入chars的字符数
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
