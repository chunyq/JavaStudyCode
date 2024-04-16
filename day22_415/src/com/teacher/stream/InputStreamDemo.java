package com.teacher.stream;


import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author yh
 * @create 10:15
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        //1.创建文件字节输入流:读取数据(文件必须存在)
        FileInputStream inputStream = new FileInputStream("F:/test/a.txt");

        //2.读取数据
      /*  //一次读一个字节
        int i = inputStream.read();// 读到的字节数 -1:文件结尾
        System.out.println(i);

        i = inputStream.read();
        System.out.println(i);
        i = inputStream.read();
        System.out.println(i);
        i = inputStream.read();
        System.out.println(i);
        i = inputStream.read();
        System.out.println(i);*/

        byte[] bytes = new byte[1024];//读取到的数据存储到字节数组中
        //一次读一个字节数组,数据放到字节数组中,返回读到的字节长度
        //int i = inputStream.read(bytes);//真实读取到的字节长度
        int i = inputStream.read(bytes, 0, 2);//真实读取到的字节长度

        System.out.println(i);
        System.out.println("====");
        //System.out.println( new String(bytes) +":::" );
        System.out.println(new String(bytes, 0, i) + ":::");
        System.out.println("====");

        //3.释放资源
        inputStream.close();

    }
}
