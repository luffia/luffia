package com.zixue.InputStream_;

import com.zixue.outputstaream_.Dog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class ObjectInputStream01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath="/Users/huyu/Desktop/z.docx";
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream(filePath));
        //读取 就直接输出到控制台
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object object = ois.readObject();

        ois.close();
    }
}
