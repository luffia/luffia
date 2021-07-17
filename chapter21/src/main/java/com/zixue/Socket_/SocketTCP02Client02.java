package com.zixue.Socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
@SuppressWarnings({"all"})
public class SocketTCP02Client02 {
    public static void main(String[] args) throws IOException {
//       分析：
//        1、连接服务端（IP，端口号）
//        连接本机的9999端口，如果连接成功返回sock对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());
//        2、连接上后，生成Socket 通过 socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();
//        3、通过输出流写入数据到 数据通道
        outputStream.write("hello,zhang".getBytes());
//
//       设置一个结束标记
        socket.shutdownOutput();
//
//        4、获取和socket 相关的输入流，读取字节并显现
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readlen = 0;
        while ((readlen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readlen));
        }
//       5、 关闭流对象和socket
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出。。。。");
    }

}
