package com.zixue.InputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * <p>
 * 演示  FileInputStream  的使用（字节输入流   文件----->>>程序
 */
public class FileInputStream01 {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件
     * 单个字节的读取
     */
    @Test
    public void readFile01() {
        String filePath = "/Users/huyu/Desktop/hello.txt";// 1、 获取文件的路径
        int readDate = 0;
        FileInputStream fileInputStream = null;
        try {
//            创建 fileInputStream 文件输入流对象，读取路径
            fileInputStream = new FileInputStream(filePath);

//          从该输入流 循环读取一个字节的数据，如果没有输入可用，此方法将终止
//            如果返回 -1 则表示读取完毕
            while ((readDate = fileInputStream.read()) != -1) {
                System.out.println((char) readDate); //转成 char 显示出来
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //优化 使用 read（byte【】 b）读取文件，提高效率
    @Test
    public void readFile02() {
        String filePath = "/Users/huyu/Desktop/hello.txt";// 1、 获取文件的路径
        int readDate = 0;
//
//        字节数组
        byte[] buf = new byte[8];//一次读取8 个字节
        int readLen = 0;//读取 长度
        FileInputStream fileInputStream = null;
        try {
//            创建 fileInputStream 文件输入流对象，读取路径
            fileInputStream = new FileInputStream(filePath);

//          从该输入流 循环读取一个字节的数据，如果没有输入可用，此方法将终止
//            如果返回 -1 则表示读取完毕
//            如果读取正常，返回实际读取的字节书
            while ((readLen = fileInputStream.read(buf)) != -1) {//把实际读取的返回给readLen
                System.out.print(new String(buf,0,readLen)); //转成 char 显示出来
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
