package com.zixue.reflection.class_;

import com.zixue.Car;

import java.lang.reflect.Field;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        String classAllPath="com.zixue.Car";
//      1、  获取Car 类 对应的 Class对象
//        <?> 表示不确定的 Java 类型
        Class<?> cls = Class.forName(classAllPath);
//      2、  输出cls
        System.out.println(cls);//显示 cls 对象，是哪个类的 Class 对象，输出：class com.zixue.Car
        System.out.println( cls.getClass());//输出 cls 的运行类型  class java.lang.Class
//        3、得到包名
        System.out.println(cls.getPackage().getName());//包名 com.zixue
//        4、得到全类名
        System.out.println(cls.getName());// 输出：com.zixue.Car
//        5、通过 cls 创建对象实例
        Object car =(Car)cls.newInstance();
        System.out.println(car);//Car{brand='bwm', price=900000, color='red'}
//        6 、通过反射获取属性
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car)); //  bwm
//        7 、 通过反射给属性赋值
        brand.set(car," 奔驰");
        System.out.println(brand.get(car));// 奔驰
//        8、得到所有 的属性（字段）】
        Field[] fields = cls.getFields();
        for (Field f:fields){
            System.out.println(f.getName());//brand  price   color
        }
    }

}
