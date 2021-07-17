package com.zixue.upload_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
//        1、在服务端 本机 监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888 端口监听。。。等待连接。。。");
//        2、在服务端等待链接
        Socket socket = serverSocket.accept();
//3、读取客户端发送的数据
//        通过 socket得到一个输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
//        将得到的bytes写入到一个路径，就得到一个文件
        String destFilePath = "/Users/huyu/Desktop/huahua.JPG";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();
//        x向客户端回复 收到图片
//        通过socket 活得输出流（字符流
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片。。");
        writer.flush();//把内容刷新到数据通道
        socket.shutdownOutput();//设置写入结束标记

        writer.close();
        bis.close();
        serverSocket.close();
        socket.close();

    }
}
