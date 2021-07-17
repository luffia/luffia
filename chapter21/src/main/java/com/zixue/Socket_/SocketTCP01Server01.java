package com.zixue.Socket_;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 *
 *      服务端
 */
public class SocketTCP01Server01 {
    public static void main(String[] args) throws IOException {
//        分析

//        1、在本机的 9999端口监听，等待连接
//        注意：一定要要求在本机没有其他服务在监听/占用9999端口
//         ServerSocket 可以通过accept() 返回多个 Socket
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在999端口进行监听。。。。等待链接");
//        2、当没有客户端连接9999端口时，程序会阻塞，等待链接
//        如果有客户端连接 则会返回一个Socket 对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket= "+socket.getClass() );
//        3、通过 socket.getInputStream()读取客户端写入到数据通道的数据显示
        InputStream inputStream = socket.getInputStream();

//        IO 读取
        byte[] buf = new byte[1024];
        int readLen=0;
        while((readLen=inputStream.read(buf))!=-1){
//            根据读取到的实际长度，显示内容
            System.out.println(new String(buf,0,readLen));
        }
//        关闭流和socket
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出。。。。");
    }
}
