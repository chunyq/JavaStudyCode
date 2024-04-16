package com.homework.exer4;

import java.io.File;
import java.io.IOException;

/**
 * ClassName:DeleteFile
 * Package:com.homework.exer4
 *
 * @Author 86183
 * @Create 2024/4/14 22:53
 */
public class DeleteFile {
    public static void main(String[] args) {
        String directoryPath = "F:\\YunHeKnowledge\\javaStudyCode\\demo";
        File directory = new File(directoryPath);

        try {
            deleteDirectory(directory);
            System.out.println("文件夹删除成功");
        } catch (IOException e) {
            e.printStackTrace(); //用于打印异常堆栈跟踪信息的方法
        }
    }

    public static void deleteDirectory(File directory) throws IOException {
        if (directory.exists()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteDirectory(file); // 递归调用
                    } else {
                        file.delete(); // 删除文件
                    }
                }
            }
            directory.delete(); // 删除目录
        } else {
            System.out.println("文件夹不存在");
        }
    }
}
