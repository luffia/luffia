package com.zixue.reader_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 *
 * 使用 单个字符 读取文件，效率低
 */
public class FileReader01 {
    public static void main(String[] args) {
//用FileReader读取story中的内容，并显示
        String filePath="/Users/huyu/Desktop/story.txt";
        FileReader fileReader=null;
        int date=0;
        try {
            fileReader = new FileReader(filePath);
            while ((date= fileReader.read() )!=-1){ //布尔类型进行判断
                System.out.print((char)date);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
