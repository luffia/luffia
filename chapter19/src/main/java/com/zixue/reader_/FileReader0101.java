package com.zixue.reader_;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * <p>
 * 使用 字符数组 读取文件
 */
public class FileReader0101 {
    public static void main(String[] args) {
        String filePath = "/Users/huyu/Desktop/story.txt";
        FileReader fileReader = null;

//        定义读取长度，初始化为0；
        int readLen=0;
//        定义一个char【】
        char[] buf=new char[8];


        try {
            fileReader = new FileReader(filePath);

//          使用while 循环 读取时候使用 read(buf),返回的是实际读取到的 字符数
//            如果返回的是 -1 则说明文件读取到了
            while ((readLen = fileReader.read(buf)) != -1) { //布尔类型进行判断

//               这里 读取一个字符串，把(buf,0,readLen)转成字符串进行读取
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

