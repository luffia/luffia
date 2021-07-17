package com.zixue.reflection.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * 反射问题的引入
 */
@SuppressWarnings({"all"})
public class ReflectionQuestion {
//    根据配置文件 re.properties  指定信息创建Cat 对象并调用方法 hi
//    传统方式
//    1、使用 Properties 类可以读取配置文件
public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
    Properties properties = new Properties();
    properties.load(new FileInputStream("src/re.properties"));
    String classfullpath = properties.get("classfullpath").toString();
    String method = properties.get("method").toString();//hi
    System.out.println("classfullpath"+classfullpath);
    System.out.println("method"+method);

//    使用反射机制
//   1、 加载类，返回Class 类型的对象 cls
    Class cls = Class.forName(classfullpath);
//
//   2、 通过 cls 得到加载类 com.zixue.Cat 对象实例
    Object o = cls.newInstance();
    System.out.println("o的 运行类型="+o.getClass());// 运行类型

//    3、通过 cls 得到你加载的类 com。zixue。Cat
//    在  反射中  可以把方法视为对象（万物皆对象）
    Method method1 = cls.getMethod(method);

//    4  同过method1  调用方法 ：即通过该方法对象 来实现调用方法
    System.out.println("===========================================");
    method1.invoke(o);//   反射机制 方法.invoke （对象）

}

}
