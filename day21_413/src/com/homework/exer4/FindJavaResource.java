package com.homework.exer4;

import java.io.File;

/**
 * ClassName:FindJavaResource
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/14 1:25
 */
public class FindJavaResource {
    private static final String ROOT_DIR = "F:\\YunHeKnowledge\\javaStudyCode";
    private static final String FILE_EXTENTION = ".java";

    public static void main(String[] args) {
        File root = new File(ROOT_DIR);
        findJavaFile(root);
    }

    public static void findJavaFile(File f) {
        //�г�Ŀ¼�е��ļ�����Ŀ¼
        File[] files = f.listFiles();
        if (files != null) {
            for (File file : files) {
                //������ļ���������.java��β���ʹ�ӡ�����·��
                if (file.isFile() && file.getName().endsWith(FILE_EXTENTION)) {
                    System.out.println(file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    findJavaFile(file);
                }
            }
        }
    }
}
