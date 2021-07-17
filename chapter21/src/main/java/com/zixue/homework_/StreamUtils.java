package com.zixue.homework_;

import java.io.*;


/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class StreamUtils {

    /**
     * 将 InputStream 转换成    String
     *
     * @param inputStream
     * @return
     * @throws Exception
     */
    public static String streamToString(InputStream inputStream) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {//当读取到空时候表示结束
            builder.append(line + "\r\n");
        }
        return builder.toString();
    }

    //    用于演示关于流的读写方法
//    功能：将输入流转换成byte【】，把文件的内容读取到字节数组byte【】
//    @param is
//    @return
//    @Throws Exception
    public static byte[] streamToByteArray(BufferedInputStream is) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024]; //字节数组
        int len;
        while ((len = is.read(b)) != -1) { //循环读取
            bos.write(b, 0, len); //把读取到的数据写入到bos
        }
        byte[] array = bos.toByteArray(); //然后将bos 转成字节数组
        bos.close();
        return array;
    }
}