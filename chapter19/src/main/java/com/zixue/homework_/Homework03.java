package com.zixue.homework_;

import java.io.*;
import java.util.Properties;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
//     编写 dog.properties
//     name=tom，age=5，color=red
//   （2）编写 Dog类（name，age，color）创建一个dog对象，读取dog.properties
//       用相应的内容完成属性初始化。并输出
        Properties properties = new Properties();
        properties.load(new FileReader("src/dog.properties"));
        properties.list(System.out);

        String name = properties.get("name") + "";  // 将 Object---》String
        int age = Integer.parseInt((properties.get("age") + ""));//将Object--》int
        String color = properties.get("color") + "";  //Object---》String

        Dog dog = new Dog(name, age, color);
        System.out.println("===========================");
        System.out.println(dog);

//        将dog 序列化 到下面文件
        String srcFilePath = "/Users/huyu/Desktop/dog01.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(srcFilePath));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();
        System.out.println("=============序列化成功==============");
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

