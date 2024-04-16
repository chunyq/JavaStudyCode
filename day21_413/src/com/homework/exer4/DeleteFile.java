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
            System.out.println("�ļ���ɾ���ɹ�");
        } catch (IOException e) {
            e.printStackTrace(); //���ڴ�ӡ�쳣��ջ������Ϣ�ķ���
        }
    }

    public static void deleteDirectory(File directory) throws IOException {
        if (directory.exists()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteDirectory(file); // �ݹ����
                    } else {
                        file.delete(); // ɾ���ļ�
                    }
                }
            }
            directory.delete(); // ɾ��Ŀ¼
        } else {
            System.out.println("�ļ��в�����");
        }
    }
}
