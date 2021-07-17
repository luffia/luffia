package com.zixue.reflection.class_;

import java.io.Serializable;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> cls1 = String.class;//外部类
        System.out.println(cls1);//class java.lang.String

        Class<Serializable> cls2 = Serializable.class;//接口
        System.out.println(cls2);//interface java.io.Serializable

        Class<Integer[]> cls3 = Integer[].class;//数组
        System.out.println(cls3);//class [Ljava.lang.Integer;

        Class<Float> cls4 = float.class;//二维数组
        System.out.println(cls4);//float

        Class<Deprecated> cls5 = Deprecated.class;//注解
        System.out.println(cls5);//interface java.lang.Deprecated

//        枚举
        Class<Thread.State> cls6 = Thread.State.class;
        System.out.println(cls6);//class java.lang.Thread$State

        Class<Long> cls7 = long.class;//基本数据类型
        System.out.println(cls7);//long

        Class<Void> cls8 = void.class;//void数据类型
        System.out.println(cls8);//void

        Class<Class> cls9 = Class.class;
        System.out.println(cls9);//class java.lang.Class

    }
}
