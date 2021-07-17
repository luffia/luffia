package com.zixue.transformation_;

import java.io.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 *  演示 OutputStreamReader
 *  *
 */
public class OutputStreamReader01 {
    public static void main(String[] args) throws IOException {
        String filePath= "/Users/huyu/Desktop/33.txt";
        OutputStreamWriter osw =  new OutputStreamWriter(new FileOutputStream(filePath),"gbk");
        osw.write("hello,张花花吃粑粑");
        osw.close();
        System.out.println("保存文件成功。。。");

    }
}
