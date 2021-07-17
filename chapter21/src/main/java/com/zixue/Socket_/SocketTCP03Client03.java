package com.zixue.Socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * 使用字符流
 */
@SuppressWarnings({"all"})
public class SocketTCP03Client03 {
    public static void main(String[] args) throws IOException {
//       分析：
//        1、连接服务端（IP，端口号）
//        连接本机的9999端口，如果连接成功返回sock对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());
//        2、连接上后，生成Socket 通过 socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();
//
//        3、通过输出流写入数据到 数据通道
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server  字符流。。");
//        插入一个换行符，表示写入的内容结束，主要，要求对方使用readLine（）！！！
        bufferedWriter.newLine();
//        如果使用字符流 需要手动刷新，否则数据不会写入数据通道
        bufferedWriter.flush();
//
//
//        4、获取和socket 相关的输入流，读取字节并显现
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

//       5、 关闭流对象和socket
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出。。。。");
    }

}
