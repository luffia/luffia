package com.zixue.homework_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Homework03Server {
    public static void main(String[] args) throws Exception {
///       监听  9999端口，等待客户连接 并 读取  下载文件的名字
        ServerSocket serverSocket = new ServerSocket(9999);
//        2、等客户连接
        System.out.println("服务端9999端口，等待连接。。。");
        Socket socket = serverSocket.accept();
//        3、读取  客户端发送要下载的文件名
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downLoadFileName = " ";
        while ((len = inputStream.read(b)) != -1) {
            downLoadFileName = new String(b, 0, len);
        }
        System.out.println("客户端需要下载文件名=" + downLoadFileName);
//        如果客户下载的是  一万次开心， 就返回该文件，否则  一律返回  一万次悲伤，哈哈哈
        String resFileName = " ";
        if ("一万次开心".equals(downLoadFileName)) {
            resFileName = "src/一万次开心.mp3";
        } else {
            resFileName = "src/一万次悲伤.mp3";
        }
//        4、创建一个输入流，读取文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));
//        5、使用工具类 读取文件到一个字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

//        6、在得到关联的输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
//        7、写入到数据通道，返回给客户端
        bos.write(bytes);
        bos.flush();
        socket.shutdownOutput();
//        关闭相关流
        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出。。。。。");
    }
}