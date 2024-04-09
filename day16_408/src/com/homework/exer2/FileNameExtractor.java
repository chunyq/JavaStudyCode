package com.homework.exer2;

/**
 * ClassName:FileNameExtractor
 * Package:com.homework.exer2
 *
 * @Author 86183
 * @Create 2024/4/8 19:13
 */
public class FileNameExtractor {
    public static void main(String[] args) {
        String file = "C:\\Users\\lx\\Desktop\\hello.txt";
        //获取最后一个反斜杠的位置
        int LastSlashIndex = file.lastIndexOf("\\");
        String fileName = file.substring(LastSlashIndex + 1);
        System.out.println("文件名：" + fileName);
    }
}
