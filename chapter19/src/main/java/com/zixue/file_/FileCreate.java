package com.zixue.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */

public class FileCreate {
    public static void main(String[] args) {

    }

    //    方式一：createNewFile  创建新文件
    //    new File(String pathname) .    //根据路径构建一个File 对象
    @Test
    public void create01() {
        String filePath = "/Users/huyu/Desktop";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功。。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    方式二：/new File(File parent  ,String child)   //根据父目录文件+子路径构建
//    public
    @Test
    public void create02() {
        File parentFile = new File("Macintosh HD\\用户\\huyu\\桌面\\");
        String fileName = "news2.doc";
//file 对象 在Java程序中，只是一个对象
//        只有执行了createNewFile 方法才会真正在磁盘创建该文件
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件2 创建成功。。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //方式三：
//new File(String parent, String child)  //根据父目录+子路径构建
    @Test
    public void create03() {
String parentPath=" /Users/huyu/Desktop";
String fileName="news3.docx";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件3 创建成功了");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
