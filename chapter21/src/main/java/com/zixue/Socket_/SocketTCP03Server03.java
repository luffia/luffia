package com.zixue.Socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * <p>
 * 服务端  使用字符流
 */
public class SocketTCP03Server03 {
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
        System.out.println("服务端 socket= " + socket.getClass());
//        3、通过 socket.getInputStream()读取客户端写入到数据通道的数据显示
        InputStream inputStream = socket.getInputStream();

//       4、 IO 读取,使用字符流，使用 InputStreamReader 将inputStream转换成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
//        5、获取socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
//      使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,Client 字符流。。。。");
//        插入一个换行符，表示结束
        bufferedWriter.newLine();
//        需要手动刷新
        bufferedWriter.flush();
//     6、   关闭流和socket
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
    }
}
