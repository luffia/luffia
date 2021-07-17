package com.zixue.Properties_;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
//      演示 创建、修改 配置文件

//        1、创建新的对象
        Properties properties = new Properties();
//        2、写入相关信息
//        如果该文件没有相应的 K-V 那么就是创建， 如果有，就是直接替换
        properties.setProperty("charset","utf8");
        properties.setProperty("user1","张小花");
        properties.setProperty("pwd1","232323");
        properties.setProperty("pwd1","3");//这个就替换类上面的 pwd
//        3、写完之后存储到文件
        properties.store(new FileWriter("src/mysql02.properties"),null);
        System.out.println("配置文件保存成功！！！");
    }
}
