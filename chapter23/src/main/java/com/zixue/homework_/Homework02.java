package com.zixue.homework_;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //利用 Class 类的for name方法得到  File类的class对象
        // 控制台打印File类的所有构造器
        //通过newInstance的方法创建File 对象并创建 文件

//        1  利用 Class 类的for name方法得到  File类的class对象
        Class<?> fileCls = Class.forName("java.io.File");

//       2  控制台打印File类的所有构造器
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
//        遍历输出
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File的构造器=" + declaredConstructor);

//       3   通过newInstance的方法创建File 对象并创建 文件
//            3-1 单独的得到 这个构造器 public java.io.File(java.lang.String)
            Constructor<?> declaredConstructor1 = fileCls.getDeclaredConstructor(String.class);
//            3-2  创建路径
            String filePath = "/Users/huyu/Desktop/mynew.txt";
//            3-3  通过newInstance的方法得到file文件
            Object file = declaredConstructor1.newInstance(filePath);//创建了File对象，运行类型是File

//        4   得到 createNewFile方法 对象
            Method createNewFile = fileCls.getMethod("createNewFile");
            createNewFile.invoke(file);
            System.out.println("文件创建成功。。。"+filePath);
//           File的 运行类型是File
            System.out.println(file.getClass());

        }
    }
}
