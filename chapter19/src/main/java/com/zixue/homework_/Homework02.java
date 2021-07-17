package com.zixue.homework_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
//        要求使用 BufferedReader 读取一个文本文件，为每行加上引号
//         连痛内容一同输出到显示器
        String filePath = "/Users/huyu/Desktop/32.txt";
        BufferedReader bufferedReader = null;
        String line;
        int count = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println( (++count) +line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
