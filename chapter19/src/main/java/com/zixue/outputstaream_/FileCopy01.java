package com.zixue.outputstaream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * <p>
 * 文件 的拷贝
 */
public class FileCopy01 {
    public static void main(String[] args) {
        /**
         * 完成文件的拷贝，把图片 /Users/huyu/Desktop/111.JPG拷贝到 /Users/huyu/Desktop/1232
         *
         * 1、创建文件输入流，将文件读入到Java程序
         * 2、创建文件的输出流，将文件输入到指定到地方
         * 3、在完成程序时，读取 部分数据就 写入 到指定的文件，使用 循环
         * */

//        拷贝前后的路径
        String srcFilePath = "/Users/huyu/Desktop/111.JPG";
        String destFilePath = "/Users/huyu/Desktop/H.docx";

        //1、初始化 文件输入流跟文件输出流 = null
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
//
//        把路径放入文件输入输出流中
        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);

            byte[] buf = new byte[1023];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
//                读取到后，就写入到文件中去 通过  fileOutputStream
//                即一般读 一边写才可以
                fileOutputStream.write(buf, 0, readLen);
            }
            System.out.println("文件拷贝成功～～");
        } catch (IOException e) {
            e.printStackTrace();

//            拷贝完成后就要关机输入输出流

        } finally {//做判断是否等于 null
            if (fileInputStream != null) {
                try {
//                    由于初始化的时候是空的 null，所以这里判断是否为null
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ;
            }
            if (fileOutputStream != null) {
                try {
//                    由于初始化的时候是空的 null，所以这里判断是否为null
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
