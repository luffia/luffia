package com.zixue.Properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 *
 * 使用 Properties  读取文件信息
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
//        1、创建 Properties  对象
        Properties properties = new Properties();

//        2、加载文件信息
        properties.load(new FileReader("src/mysql.properties"));

//        3、显示 信息 到控制台
        properties.list(System.out);

//        根据 K-Y 键 得到相应的 值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        String country = properties.getProperty("country");
        System.out.println("用户名是"+user);
        System.out.println("密码是"+pwd);
        System.out.println("国家是"+country);//显示null

    }
}
