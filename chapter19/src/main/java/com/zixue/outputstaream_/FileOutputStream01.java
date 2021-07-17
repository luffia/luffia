package com.zixue.outputstaream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    // FileOutputStream在a.txt文件中写入：hello world，如果文件不存在会创建文件
//写入：hello world。     write
    @Test
    public void writeFile() {
        //创建路径
        String filePath = "/Users/huyu/Desktop/a.txt";
        FileOutputStream fileOutputStream = null;  //初始化文件输出流为 null
        try {
            //说明
//            1、这种new FileOutputStream(filePath) 是覆盖原来的内容
          fileOutputStream =   new FileOutputStream(filePath,true);  //写入内容时，是在文末追加，为不是覆盖
//            fileOutputStream = new FileOutputStream(filePath);
            //写入一个字节
            fileOutputStream.write('H');
//            写入字符串
            String str = "zhang,xiao,hua!~";


//            也可以这样写，将字符串从第几个开始偏移，到指定直接结束的数量
            fileOutputStream.write(str.getBytes(), 0, str.length());

//
//          或者  把字符串转成一个字节数组  str.getBytes()
            fileOutputStream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
