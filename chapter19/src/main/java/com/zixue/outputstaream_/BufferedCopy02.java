package com.zixue.outputstaream_;

import java.io.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcFilePath = "/Users/huyu/Desktop/111.JPG";
        String distFilePath = "/Users/huyu/Desktop/222.JPG";
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(distFilePath));

            byte[] buff = new byte[1024];
            int readLen=0;
            while( (readLen= bis.read(buff))!=-1){
                bos.write(buff,0,readLen);
            }
            System.out.println("文件拷贝成功。。。。");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bis!=null){
                    bis.close();
                    if (bos!=null){
                        bos.close();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

