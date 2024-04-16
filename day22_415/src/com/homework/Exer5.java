package com.homework;

import java.io.*;

/**
 * ClassName:Exer5
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/15 19:56
 */
//字符缓冲流
public class Exer5 {
    public static void main(String[] args) throws IOException {
        //节点流
        FileReader fileReader = new FileReader("F:\\YunHeKnowledge\\javaStudyCode\\demo.txt");
        FileWriter fileWriter = new FileWriter("F:\\YunHeKnowledge\\javaStudyCode\\demo_copy.txt");
        //缓冲流
        BufferedReader br = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        String s;
        while ((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();//换行
            bw.flush();//刷新
        }
        // 关闭流:先关闭写的流  再关闭读的流
        br.close();
        bw.close();
    }
}
