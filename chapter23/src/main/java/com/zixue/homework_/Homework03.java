package com.zixue.homework_;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 *
 * 联系本章的知识点
 */
public class Homework03 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
//        1、得到 Dog 对应的Class类
        Class<?> cls = Class.forName("com.zixue.homework_.Dog");
//        2、创建新的对象
        Object o = cls.newInstance();
//        3、获取类中的成员
//        用反射得到 age
        Field age = cls.getField("age");
        age.set(o,13);
        System.out.println(o);
//        用反射得到 name
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);//私有属性，进行爆破
        name.set(o,"bob");
        System.out.println(o);

//        调用 hi方法
        Method hi = cls.getMethod("hi", int.class, char.class);
        hi.invoke(o,17,'男'); //17  男

//        调用 cry 方法
        Method cry = cls.getDeclaredMethod("cry", String.class, int.class, char.class);
        cry.setAccessible(true);
        Object dog = cry.invoke(o, "张小花", 12, '女');
        System.out.println(dog);//张小花 12 女

        //调用所有方法
        Method[] declaredMethods = cls.getDeclaredMethods();
//        循环遍历输出
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println("=============================================");
//        构造器
        //无参构造器
        System.out.println(o);
//       you can 私有
        System.out.println("----------------------------------------------");
        Constructor<?> constructor = cls.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        Object obj = constructor.newInstance( "花小张", 23);
        System.out.println(obj);//Dog{name='花小张', age=23, color='null', gender= }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        得到所有的构造器
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

    }
}
class Dog{
    private String name;
    public int age=10;
    protected String color;
    public char gender;

    public Dog() {
    }
    private Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private static String cry(String s,int n,char c){
        return s+" "+ n+" "+c;
    }
    public void hi(int n,char c){
        System.out.println( n+" "+" "+c);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}