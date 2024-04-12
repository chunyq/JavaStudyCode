package com.yh1_file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName:FileTest
 * Package:com.yh1_file
 *
 * @Author 86183
 * @Create 2024/4/12 14:32
 */
public class FileTest {
    /*
     *   文件的路径表示方式：
     * 方式1：绝对路径：以windows操作系统为例，包括盘符在内的文件或文件目录的完整路径。
     * 方式2：相对路径：相对于某一个文件目录来讲的相对的位置。
     *          在IDEA中，如果使用单元测试方法：相对于当前的module来讲
     *                   如果使用main()方法：相对于当前的project来讲
     */
    @Test
    public void test1() {
        //public File(String pathname)
        File file1 = new File("F:\\YunHeKnowledge\\javaStudyCode\\day20_412\\hello.txt");

        File file2 = new File("hello.txt");

        File file3 = new File("abc1");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file3.getAbsolutePath());
        //F:\YunHeKnowledge\javaStudyCode\day20_412\abc1
    }

    public static void main(String[] args) {
        File file4 = new File("abc1"); //文件创建在module下
        System.out.println("绝对路径：" + file4.getAbsolutePath());
        //绝对路径：F:\YunHeKnowledge\javaStudyCode\abc1
        //但绝对路径却在project下
    }

    @Test
    public void test2() {
        //public File(String parent,String child)
        //参数1：一定是文件目录
        //参数2：可以是一个文件，也可以是一个文件目录
        new
    }
}
