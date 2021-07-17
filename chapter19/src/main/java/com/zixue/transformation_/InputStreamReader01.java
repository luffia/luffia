package com.zixue.transformation_;

import java.io.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * <p>
 * 演示 使用 InputStreamReader 转换流解决 中文乱码问题
 * 将字节流 FileInputStream 转换成字符流 InputStreamReader 并指定编码 u
 */
public class InputStreamReader01 {
    public static void main(String[] args) throws IOException {
//        1、把路径写出来
        String filePath= "/Users/huyu/Desktop/32.txt" ;

//        2、 先创建 BufferedReader 包装流
//        创建 InputStreamReader ，将 FileInputStream 转换成 InputStreamReader ,同时指定编码
//        new FileInputStream(filePath),"gbk") 指定编码，
       BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));

//        读取
        String s= br.readLine();
        System.out.println("读取的内容是="+s);
       br.close();
    }
}
