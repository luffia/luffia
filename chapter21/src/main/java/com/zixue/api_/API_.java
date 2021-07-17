package com.zixue.api_;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 *
 * 演示  InetAddress 类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

//     1、   获取本机 InetAddress 对象 getLocalHost

        InetAddress localHost = InetAddress.getLocalHost();  //直接返回得到.异常直接抛出
        System.out.println(localHost);//然后输出。结果 luffyia/192.168.1.11

////   2、  根据指定主机名/ 域名 获取 IP 地址对象 getByName
//        InetAddress host1 = InetAddress.getByName(" luffyia");
//        System.out.println(host1);//luffyia/192.168.1.11

//     3、   根据指定 域名 获取 IP 地址对象 getByName
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2); //www.baidu.com/36.152.44.96

//     4、   通过 InetAddress 对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2 对应的IP="+hostAddress);//host2 对应的IP=36.152.44.95


//     5、   通过 InetAddress 对象，获取对应的主机名/ 或者域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名 / 域名="+hostName);//host2对应的主机名 / 域名=www.baidu.com
    }
}
