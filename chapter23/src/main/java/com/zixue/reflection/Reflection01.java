package com.zixue.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
@SuppressWarnings({"all"})
public class Reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();//hi


//        使用反射机制
//   1、 加载类，返回Class 类型的对象 cls
        Class cls = Class.forName(classfullpath);
//
//   2、 通过 cls 得到加载类 com.zixue.Cat 对象实例
        Object o = cls.newInstance();//o的 运行类型=class com.zixue.Cat
        System.out.println("o的 运行类型=" + o.getClass());// 运行类型

//    3、通过 cls 得到你加载的类 com。zixue。Cat
//    在  反射中  可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(method);
        System.out.println(method1);//public void com.zixue.Cat.hi()

//    4  同过method1  调用方法 ：即通过该方法对象 来实现调用方法
        System.out.println("===========================================");
        method1.invoke(o);//   反射机制 方法.invoke （对象）

//     5、    Java.lang.reflect.Field:代表类的成员变量，Field对象表示某个类的成员变量
//        得到 name 字段
//        不能得到私有的属性
        Field nameField = cls.getField("age");
//        传统方法是 对象.成员变量      反射是    成员变量对象.get（对象）
        System.out.println(nameField.get(o));

//        6、Java.lang.reflect.Construction：代表类的构造方法，.Construction对象表示构造器
//              构造器可以构建对象，可以用很多方法来自执行
        Constructor constructor = cls.getConstructor();//()中可以指定构造器参数类型，返回无参构造器
        System.out.println(constructor);//输出没有行参的构造器 Cat（）

        Constructor constructor1 = cls.getConstructor(String.class);//这里传入的  String.class 就是 String 类的Class对象
        System.out.println(constructor1);//输出  有行参的构造器 Cat（Sting name）

    }
}

