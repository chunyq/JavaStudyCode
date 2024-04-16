package com.teacher.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 2.从info.txt中读取全部数据,并打印输出到控制台上
 */
public class LianXi02 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("F:/test/info.txt");

            byte[] bytes = new byte[500];
            int len;

            while ((len = fileInputStream.read(bytes)) != -1) {
                //    读取数据
                System.out.println(new String(bytes, 0, len));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
