package com.zixue.upload_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
//       1、 客户端连接服务端 得到socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
//        2、创建 读取 磁盘图片的输入流
        String filePath = "/Users/huyu/Desktop/hua.JPG";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
//
//        bytes就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
//      通过Socket 获取个输出流，通过bytes 发送到服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//将文件对应的字节数组的内容，写入到数据通道

        socket.shutdownOutput();//设置写入数据的结束标记
//
//        接收从服务端回复的消息==========================
        InputStream inputStream = socket.getInputStream();
//      使用 StreamUtils 的方法，直接将 inputStream 读取到的内容转换成 字符串String
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);
//        关闭相关流
        inputStream.close();
        bis.close();//关闭流
        bos.close();
        socket.close();
    }
}
