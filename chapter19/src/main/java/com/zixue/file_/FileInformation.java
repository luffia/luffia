package com.zixue.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    //获取文件信息
    @Test
    public void info(){
//        先创建文件对象
        File file = new File( "Macintosh HD:\\用户\\huyu\\桌面\\news1.txt");
//        调用相应的方法得到对应的信息
        System.out.println("文件名字="+file.getName());
        System.out.println("绝对路径"+file.getAbsolutePath());
        System.out.println("父级目录"+file.getParent());
        System.out.println("文件大小(字节）"+file.length());
        System.out.println("文件是否存在"+file.exists());
        System.out.println("是不是一个文件"+file.isFile());
        System.out.println("是不是一个目录"+file.isDirectory());
    }
}

