package com.zixue.homework_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * 文件下载的客户端
 */
public class Homework03Client {
    public static void main(String[] args) throws Exception {
//        1、创建Scanner 接收用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载的文件名。。。");
        String downloadFileName = scanner.next();
//        客户端连接服务端，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
//        获取Socket 关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
//        设置结束的标志
        socket.shutdownOutput();
//        4、读取服务端返回的文件【字节数据】
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
//        5、得到一个输出流
        String filePath = "/Users/huyu/Desktop/" + downloadFileName + ".mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);
//        g关闭相关资源
        bos.close();
        bis.close();
        socket.close();
        outputStream.close();
        System.out.println("客户端下载完毕，正确退出。。。。");
    }
}
