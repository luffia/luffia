package com.zixue.homework_;

import java.io.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {

        /** 在判断 桌面是否有文件夹 mytemp ，如果没有就创建
         在桌面/ 11 目录下，创建文件 hello。txt
         如果 hello。txt已经存在，提示该文件已经存在，就不要重复创建了
         写入 hello
         */

        String directoryPath = "/Users/huyu/Desktop/11";
        File file = new File(directoryPath);
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("创建" + directoryPath + "成功");
            } else {
                System.out.println("文件创建失败。。" + directoryPath);
            }
        }
        String filePath = directoryPath + "/110.txt";
//        c创建文件
        file = new File(filePath);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println(filePath + "文件创建成功");

////                使用BufferedWriter 写
//                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
//                bufferedWriter.write("hello,world");
//                bufferedWriter.close();


            } else {
                System.out.println("没有这个文本。。。" + filePath);
            }
        } else {
            System.out.println(filePath + "已经存在，不创建了。");
        }
    }
}