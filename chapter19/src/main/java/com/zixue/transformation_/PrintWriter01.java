package com.zixue.transformation_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class PrintWriter01 {
    public static void main(String[] args) throws IOException {
//        打印到显示器
//        PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("/Users/huyu/Desktop/33.txt"));
        printWriter.print("你好，张小花～～");
        printWriter.close();  //将数据写如文件


    }
}
