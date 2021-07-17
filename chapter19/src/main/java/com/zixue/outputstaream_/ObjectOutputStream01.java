package com.zixue.outputstaream_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class ObjectOutputStream01 {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/huyu/Desktop/z.docx";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(900);
        oos.writeBoolean(true);
        oos.writeChar('h');
        oos.writeDouble(2.5);
        oos.writeUTF("张小花吃粑粑～～");
        oos.writeObject(new Dog("旺财", 23));
        System.out.println("文件写入完毕～～");
        oos.close();

    }

}
