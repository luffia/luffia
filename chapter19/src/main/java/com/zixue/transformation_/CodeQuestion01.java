package com.zixue.transformation_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class CodeQuestion01 {
    public static void main(String[] args) throws IOException {
//        获取 /Users/huyu/Desktop/note.txt  文件到程序
//        创建输入字符流  BufferedReader 对象读取 note.txt
//        默认是按照utf-8 编码

        String filePath = "/Users/huyu/Desktop/note.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String s = br.readLine();
        System.out.println("读到的内容是="+s);
        br.close();
//        输出内容中文是乱码
    }
}
