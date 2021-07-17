package com.zixue.writer_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class FileWriter01 {
    public static void main(String[] args) {

        String filePath = "/Users/huyu/Desktop/note.txt";
        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter(filePath, true);//末尾直接加输入的字符
            fileWriter.write("张小花～");
            fileWriter.write("风雨过后见彩虹");
            System.out.println("文件输入成功");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
