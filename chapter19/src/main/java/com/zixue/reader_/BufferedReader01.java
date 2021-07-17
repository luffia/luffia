package com.zixue.reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * <p>
 * BufferedReader 的演示
 */
public class BufferedReader01 {
    public static void main(String[] args) throws IOException {
//        1、创建 路径
        String filePath = "/Users/huyu/Desktop/note.txt";
//        2、创建一个 bufferedReader
//           （1） new FileReader 节点流  是BufferedReader 的子类，需要读取的是  读取文件
//       （2）  new BufferedReader(new FileReader(filePath)); 将文件路径放入文件节点流后面
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
//        3、读取时候 按行读取，效率高
        String line;
//        循环读取，
//      （1）  bufferedReader.readLine()是按行读取的意思
//        （2） 用 null 来表示 文件读取完毕
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

//        关闭流，只需要关闭外 bufferedReader，因为底层会自动取关闭节点流
//        下面是源码
        /**
         *  public void close() throws IOException {
         *         synchronized (lock) {
         *             if (in == null)        ( in：FilReader@811)
         *                 return;
         *             try {
         *                 in.close();
         *             } finally {
         *                 in = null;
         *                 cb = null;
         *             }
         * */
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
