package com.teacher.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 1.多次键盘录入数据,并写入到info.txt文件中
 */
public class LianXi01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("F:/test/info.txt", true);
            while (true) {
                System.out.println("请输入数据：");
                String s = scanner.next();
                if (s.equalsIgnoreCase("exit")) {
                    break;
                }
                outputStream.write(("\r\n" + s).getBytes());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
