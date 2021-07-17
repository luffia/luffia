package com.zixue.reflection.class_;

import com.zixue.Cat;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * 对Class 类 特点的梳理
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
//
        Cat cat = new Cat();

        Class<?> cls1 = Class.forName("com.zixue.Cat");
        Class<?> cls2 = Class.forName("com.zixue.Cat");
        System.out.println();
    }
}
