package com.zixue.Properties_;

import java.io.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {

//        读取mysql.properties 中的文件  并得到 ip   user 和  pwd
        BufferedReader br = new BufferedReader(new FileReader("src/mysql.properties"));
        String line="";
        while( (line = br.readLine())!=null) {
            String[] split = line.split("=");
            System.out.println(split[0]+"值是："+split[1]);
        }
        br.close();
    }
}
