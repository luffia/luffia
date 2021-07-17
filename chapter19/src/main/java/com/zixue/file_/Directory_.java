package com.zixue.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1() {
        String filePath = "Macintosh HD:\\用户\\huyu\\桌面\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {//public boolean delete() 返回的是布尔类型值
                System.out.println(filePath + "删除成功。。。");
            } else {
                System.out.println(filePath + "该文件删除失败。。。。。");
            }
        }else {
            System.out.println("该文件不存在。。。");
        }
    }



    @Test
    public void m2(){
        String filePath= "huyu$ /Users/huyu/Desktop/1232";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println(filePath+"删除成功。。。");
            }else {
                System.out.println(filePath+"删除失败。。。");
            }
        }else {
            System.out.println("文件不存在。。。。。");
        }
    }


    @Test
    public void m3(){
        String filePath= "huyu$ /Users/huyu/Desktop/1233";
        File file = new File(filePath);
        if (file.exists()){
            System.out.println(filePath+"存在。。。。。");
        }else {
          if (file.mkdirs()){
              System.out.println(filePath+"创建成功。。。");
          }else {
              System.out.println(filePath+"创建失败/。。。。");
          }
        }
    }
}